package com.zhubajie.devops.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.velocity.VelocityLayoutView;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;
import org.springframework.web.util.UrlPathHelper;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class VelocityMultipleLayoutViewResolver extends VelocityViewResolver {
	
	private static final Logger logger = LoggerFactory.getLogger(VelocityMultipleLayoutViewResolver.class);
	
	private Map<String, String> mappings = new HashMap<String, String>();
	
	private String layoutKey;
	
	private String screenContentKey;
	
	private PathMatcher pathMatcher = new AntPathMatcher();

	private UrlPathHelper pathHelper = new UrlPathHelper();
	
	protected AbstractUrlBasedView buildView(final String viewName) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Building view using multiple layout resolver. View name is {}", viewName);
		}
		
		VelocityLayoutView view = (VelocityLayoutView) super.buildView(viewName);
		
		if (this.layoutKey != null)
			view.setLayoutKey(this.layoutKey);
		
		if (this.screenContentKey != null)
			view.setScreenContentKey(this.screenContentKey);
		
		if (!this.mappings.isEmpty()) {
			for (Map.Entry<String, String> entry : this.mappings.entrySet()) {
				HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
				String path = pathHelper.getOriginatingServletPath(request);
				if (pathMatcher.match(entry.getKey(),path)) {
					if (logger.isDebugEnabled())
						logger.debug("  Found matching path. Setting layout url to {}", entry.getValue());
					view.setLayoutUrl(entry.getValue());
					return view;
				}
			}
		}
		
		return view;
	}

	public Map<String, String> getMappings() {
		return mappings;
	}

	/**
	 * Requires VelocityLayoutView.
	 * @see VelocityLayoutView
	 */
	protected Class<?> requiredViewClass() {
		return VelocityLayoutView.class;
	}
	
	/**
	 * Set the context key used to specify an alternate layout to be used
	 * instead of the default layout. Screen content templates can override the
	 * layout template that they wish to be wrapped with by setting this value
	 * in the template, for example:<br>
	 * <code>#set( $layout = "MyLayout.vm" )</code>
	 * <p>
	 * The default key is "layout", as illustrated above.
	 * @param layoutKey the name of the key you wish to use in your screen
	 * content templates to override the layout template
	 * @see VelocityLayoutView#setLayoutKey
	 */
	public void setLayoutKey(final String layoutKey) {
		this.layoutKey = layoutKey;
	}
	
	public void setMappings(Map<String, String> mappings) {
		this.mappings = mappings;
	}
	
	/**
	 * Set the name of the context key that will hold the content of the screen
	 * within the layout template. This key must be present in the layout
	 * template for the current screen to be rendered.
	 * <p>
	 * Default is "screen_content": accessed in VTL as
	 * <code>$screen_content</code>.
	 * @param screenContentKey the name of the screen content key to use
	 * @see VelocityLayoutView#setScreenContentKey
	 */
	public void setScreenContentKey(final String screenContentKey) {
		this.screenContentKey = screenContentKey;
	}
	
}

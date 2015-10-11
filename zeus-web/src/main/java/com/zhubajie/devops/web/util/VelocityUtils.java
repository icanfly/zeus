package com.zhubajie.devops.web.util;

import org.springframework.web.util.UrlPathHelper;

/**
 * @author luopeng
 *         Created on 2014/9/30.
 */
public class VelocityUtils {

	public static String getContextPath() {
		if (contextPath == null) {
			contextPath = RequestUtils.getCurrentRequest().getContextPath();
		}
		return contextPath;
	}

	public static String getCurrentRequestPath() {
		return pathHelper.getPathWithinApplication(RequestUtils.getCurrentRequest());
	}

	public static String getResourcePath(){
		if (resourcePath == null) {
			resourcePath = getContextPath() + "/resources";
		}
		return resourcePath;
	}

	private static UrlPathHelper pathHelper = new UrlPathHelper();

	private static volatile String contextPath;

	private static volatile String resourcePath;

}

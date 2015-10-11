package com.zhubajie.devops.web.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class RequestUtils {
	public static Object getAttribute(String name){
		ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return sra.getAttribute(name, ServletWebRequest.SCOPE_REQUEST);
	}
	
	public static HttpServletRequest getCurrentRequest() {
		ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return sra.getRequest();
	}
	
	public static String getParameter(String name){
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request.getParameter(name);
	}
	
	public static HttpServletRequest getRequest() {
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	public static HttpSession getSession() {
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession(true);
	}
	
	public static boolean isAjaxRequest(HttpServletRequest request) {
		boolean nativeFlag = "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
		if(nativeFlag){
			return true;
		}
		return !StringUtils.isBlank(request.getParameter(AJAX_FLAG));
	}
	
	public static void setAttribute(String name,Object value){
		ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		sra.setAttribute(name,value,ServletWebRequest.SCOPE_REQUEST);
	}
	
	public static final String AJAX_FLAG = "__ajax__";
}

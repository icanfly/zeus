package com.zhubajie.devops.web.util;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

public class SessionUtils {

	public static Object getAttribute(String sessionKey) {
		return RequestContextHolder.currentRequestAttributes().getAttribute(sessionKey,
				RequestAttributes.SCOPE_SESSION);
	}

	public static void setAttribute(String sessionKey, Object value) {
		RequestContextHolder.currentRequestAttributes().setAttribute(sessionKey, value,
				RequestAttributes.SCOPE_SESSION);
	}
}

package com.zhubajie.devops.web.util;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.Map;

/**
 * Ajax结果
 *
 * @author luopeng
 */
public class AjaxResult {

	public static AjaxResult createDefault() {
		AjaxResult result = new AjaxResult();
		result.setSuccess(false);
		return result;
	}

	public static AjaxResult createFailedResult(String msg) {
		AjaxResult result = new AjaxResult();
		result.setSuccess(false);
		result.setMsg(msg);
		return result;
	}

	@JSONField(name = "success")
	private boolean success = false;

	@JSONField(name = "msg")
	private String msg;

	@JSONField(name = "result")
	private Object result;

	@JSONField(name = "resultCode")
	private String resultCode;

	public AjaxResult fail(String msg) {
		this.setSuccess(false);
		this.setMsg(msg);
		return this;
	}

	public AjaxResult fail(String msg, String resultCode) {
		this.setSuccess(false);
		this.setResultCode(resultCode);
		this.setMsg(msg);
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public Object getResult() {
		return result;
	}

	public String getResultCode() {
		return resultCode;
	}

	public boolean isSuccess() {
		return success;
	}

	@SuppressWarnings("unchecked")
	public AjaxResult put(String key, Object value) {
		if (result == null) {
			result = new HashMap<String, Object>();
		}
		if (result instanceof Map) {
			((Map) result).put(key, value);
		} else {
			throw new RuntimeException("error ! result is not a instanceof Map ?");
		}
		return this;
	}

	public AjaxResult setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public AjaxResult setResult(Object result) {
		this.result = result;
		return this;
	}

	public AjaxResult setResultCode(String resultCode) {
		this.resultCode = resultCode;
		return this;
	}

	public AjaxResult setSuccess(boolean success) {
		this.success = success;
		return this;
	}

	public AjaxResult success() {
		this.setSuccess(true);
		return this;
	}

	public AjaxResult success(Object result) {
		this.setSuccess(true);
		this.setResult(result);
		return this;
	}
}

package com.pos.common.dto;

/**
 * Title: com.ch.common.JsonResponse<br>
 * Description: FIXME JsonResponse Description
 *
 * @author: Sample.Hsu
 * @version: 1.0
 */
public class JsonResponse {

	private String errorMessage;

	private Object data;

	public JsonResponse() {

	}

	public JsonResponse(Object data) {
		this.data = data;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}

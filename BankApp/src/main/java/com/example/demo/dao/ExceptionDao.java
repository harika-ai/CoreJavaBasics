package com.example.demo.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionDao {
	@JsonProperty("errorMessage")
	private String errorMessage;

	@JsonProperty("statusCode")
	private Integer statusCode;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public ExceptionDao() {
		super();
	}

	public ExceptionDao(String errorMessage, Integer statusCode) {
		super();
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
}

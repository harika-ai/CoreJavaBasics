package com.example.demo.exception;

public class EmptyCustomerException extends RuntimeException {

	public EmptyCustomerException() {
		super();
	}

	private static final long serialVersionUID = 1L;

	private static final Integer STATUS_CODE = 422;

	private static final String CUSTOMER_EXCEPTION = "Empty Customer Details Exception";

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getCustomerException() {
		return CUSTOMER_EXCEPTION;
	}

	public Integer getStatusCode() {
		return STATUS_CODE;
	}

}

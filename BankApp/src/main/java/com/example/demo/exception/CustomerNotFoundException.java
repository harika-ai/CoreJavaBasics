package com.example.demo.exception;

public class CustomerNotFoundException extends RuntimeException {
	public CustomerNotFoundException() {
		super();
		
	}

	private static final long serialVersionUID = 1L;

	private static final Integer STATUS_CODE = 422;

	private static final String CUSTOMER_NOT_FOUND_EXCEPTION = "Customer Details are not available w.r.t.o given id";

	public static Integer getStatusCode() {
		return STATUS_CODE;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getCustomerNotFoundException() {
		return CUSTOMER_NOT_FOUND_EXCEPTION;
	}

}

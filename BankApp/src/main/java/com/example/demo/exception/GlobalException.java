package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.dao.ExceptionDao;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(EmptyCustomerException.class)
	public ResponseEntity<ExceptionDao> emptyCustomerExceptionHandler(EmptyCustomerException emptyCustomerException) {
		ExceptionDao exceptionDao = new ExceptionDao(emptyCustomerException.getCustomerException(),
				emptyCustomerException.getStatusCode());
		return new ResponseEntity<>(exceptionDao, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ExceptionDao> customerNotFoundException(CustomerNotFoundException customerNotFoundException) {
		ExceptionDao exceptionDao = new ExceptionDao(customerNotFoundException.getCustomerNotFoundException(),
				customerNotFoundException.getStatusCode());
		return new ResponseEntity<>(exceptionDao, HttpStatus.NOT_FOUND);
	}

}

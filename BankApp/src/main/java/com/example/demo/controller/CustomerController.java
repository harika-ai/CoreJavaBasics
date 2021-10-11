package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.CustomerDao;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	// it used to create a new resource in database
	// @RequestMapping(method=RequestMethod.POST)

	@PostMapping("")
	public ResponseEntity<String> createCustomer(@Nullable @Validated @RequestBody CustomerDao customerDao) {

		String createCustomer = customerService.createCustomer(customerDao);
		return new ResponseEntity<>(createCustomer, HttpStatus.OK);

	}

	@GetMapping(path = "/{customerId}")
	public ResponseEntity<CustomerDao> customerLogin(@PathVariable Long customerId) {

		CustomerDao customerDao = customerService.customerLogin(customerId);
		return new ResponseEntity<>(customerDao, HttpStatus.OK);
	}

	@PutMapping("")
	public ResponseEntity<String> updateCustomer(@RequestParam String contactNum, @RequestParam String email) {
		String updateCustomer = customerService.updateCustomer(contactNum, email);
		return new ResponseEntity<>(updateCustomer, HttpStatus.OK);

	}

	@DeleteMapping(path = "/{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Long customerId) {
		String deleteCustomer = customerService.deleteCustomer(customerId);
		return new ResponseEntity<>(deleteCustomer, HttpStatus.OK);

	}

}

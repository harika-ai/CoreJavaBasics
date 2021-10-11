package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.CustomerDao;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.EmptyCustomerException;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRpository;

	public String createCustomer(CustomerDao customerDao) {
		if (customerDao == null) {
			throw new EmptyCustomerException();
		}
		Customer customer = new Customer();
		BeanUtils.copyProperties(customerDao, customer);
		customerRpository.save(customer);
		return "customer creation done sucessfully";

	}

	public CustomerDao customerLogin(Long customerId) {
		CustomerDao customerDao = new CustomerDao();
		Optional<Customer> customer = customerRpository.findById(customerId);
		if (!(customer.isPresent())) {
			throw new CustomerNotFoundException();
		} else {
			System.out.println(customerRpository.findById(customerId).get());
			BeanUtils.copyProperties(customerRpository.findById(customerId).get(), customerDao);
			return customerDao;
		}
	}

	public String updateCustomer(String contactNum, String email) {
		Customer customer = customerRpository.findByEmail(email);
		if (customer == null) {
			throw new CustomerNotFoundException();
		}
		customer.setContactNum(contactNum);
		customerRpository.save(customer);
		return "customer details updated sucessfully";
	}

	public String deleteCustomer(Long customerId) {
		Optional<Customer> customer = customerRpository.findById(customerId);
		if (!(customer.isPresent())) {
			throw new CustomerNotFoundException();
		} else {
			customerRpository.delete(customerRpository.findById(customerId).get());
			return "customer details deleted sucessfully w.r.to given id";

		}
	}

}

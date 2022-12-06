package com.emily.resources;

import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emily.entity.Customer;
import com.emily.model.service.CustomerService;

@RestController
public class CustomerResource {

	@Autowired
	CustomerService service;
	
	@GetMapping(path = "/customers/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer searchCustomerByCustomerIdResource(@PathVariable("customerId") int id) {
		return service.findByCustomerId(id);
		
	}
}

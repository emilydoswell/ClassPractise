package com.emily.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emily.entity.Customer;
import com.emily.model.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao dao;

	@Override
	public Customer checkLogin(int customerId, String password) {
		// Find customer with inputed Id
		Customer newCustomer = dao.findUserByCustomerId(customerId);
		
		if (newCustomer != null) {
			return newCustomer;
		} 
		return null;
	}

}

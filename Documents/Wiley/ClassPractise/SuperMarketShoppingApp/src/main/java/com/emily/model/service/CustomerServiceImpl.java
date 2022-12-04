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
	public boolean checkLogin(int customerId) {
		// Find customer with inputed Id
		Customer newCustomer = dao.searchById(customerId);
		
		newCustomer.getCustomerPassword();
		newCustomer.getCustomerId();
		
		// Now compare with inputed password and ID
		
		return false;
	}

}

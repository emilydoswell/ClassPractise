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
	public Customer findByCustomerId(int customerId) {
		return dao.findByCustomerId(customerId);
	}
	
	
}

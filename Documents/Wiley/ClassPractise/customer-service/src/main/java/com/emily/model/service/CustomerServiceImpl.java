package com.emily.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emily.entity.Customer;
import com.emily.model.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao dao;

	@Override
	public List<Customer> searchCustomerByCustomerId(int customerId) {
		return dao.searchCustomerByCustomerId(customerId);
	}
	
	
}

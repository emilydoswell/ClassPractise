package com.emily.model.service;

import com.emily.entity.Customer;

public interface CustomerService {
	
	public Customer checkLogin(int customerId, String password);
}

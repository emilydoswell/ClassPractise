package com.emily.model.service;

import com.emily.entity.Customer;

public interface CustomerService {

	public Customer findByCustomerId(int customerId);
}

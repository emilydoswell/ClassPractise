package com.emily.model.service;

import java.util.List;

import com.emily.entity.Customer;

public interface CustomerService {

	List<Customer> searchCustomerByCustomerId(int customerId);
}

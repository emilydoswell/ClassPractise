package com.emily.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emily.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, String> {
	
	public Customer searchById(int customerId);
	
	

}

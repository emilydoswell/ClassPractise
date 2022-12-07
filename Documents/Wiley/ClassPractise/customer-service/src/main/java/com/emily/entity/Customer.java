package com.emily.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Customer {
	
	@Id
	private int detailId;
	
	// customerId can't be the primary key if a customer has multiple shares (so we use detail Id as the primary key)
	private int customerId;
	
	// Customer can have multiple shares
	private int shareId;
	private String shareType;
	private int quantity;
	
}

package com.emily.entity;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Customer Table") //CHECK THIS IS THE RIGHT IMPORT!!
public class Customer {

	private int customerId;
	private String customerName;
	private String customerPassword;
	
}

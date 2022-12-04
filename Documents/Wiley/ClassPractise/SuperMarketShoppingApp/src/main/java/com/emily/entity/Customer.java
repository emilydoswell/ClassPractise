package com.emily.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer") //CHECK THIS IS THE RIGHT IMPORT!!
public class Customer {
	
	@Id
	private int customerId;
	private String customerName;
	private String customerPassword;
	
}

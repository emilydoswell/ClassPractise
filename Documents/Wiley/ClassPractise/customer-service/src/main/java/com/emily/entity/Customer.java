package com.emily.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	private int detailId;
	private int customerId;
	private int shareId;
	private String shareType;
	private int quantity;
	
}

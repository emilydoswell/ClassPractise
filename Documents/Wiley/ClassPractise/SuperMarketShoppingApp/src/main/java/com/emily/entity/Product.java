package com.emily.entity;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Product Table")
public class Product {

	private int productId;
	private String productName;
	private double costPerUnit;
	private int stock;
	
}

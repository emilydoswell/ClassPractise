package com.emily.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Product")
@Entity
public class Product {

	@Id
	private int productId;
	private double costPerUnit;
	private String productName;
	private int stock;
	
}

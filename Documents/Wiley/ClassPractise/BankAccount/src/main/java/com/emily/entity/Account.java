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
@Entity
@ToString
@Table(name="bankAccount")
public class Account {
	
	@Id
	private int accountId;
	private String userPassword;
	private String userName;
	private String userAddress;
	private String phoneNumber;
	private double bankBalance;

}

package com.sujata.entity;

import javax.persistence.Table;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UsersForEmployee")
public class User {

	@Id
	private String userName;
	private String password;
}

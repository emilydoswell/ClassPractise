package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.User;
import com.sujata.model.persistence.UserDao;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserDao dao;
	
	@Override
	public boolean loginCheck(User user) {
		User newUser = dao.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if (newUser != null) {
			return true;
		}
		
		return false;
	}
}

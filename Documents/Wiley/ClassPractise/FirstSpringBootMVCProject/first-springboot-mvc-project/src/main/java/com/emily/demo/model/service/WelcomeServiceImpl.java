package com.emily.demo.model.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String welcome() {
		System.out.println("Good Morning");
		return "Good Morning";
	}

	@Override
	public String exit() {
		System.out.println("Good Evening");
		return "Good Evening";
	}

}

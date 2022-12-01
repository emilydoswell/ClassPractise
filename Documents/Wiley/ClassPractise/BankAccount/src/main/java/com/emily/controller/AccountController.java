package com.emily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	
	@RequestMapping("/login")
	public ModelAndView checkLoginPage() {
		return new ModelAndView("Login");
	}
	
//	@RequestMapping("/menu")
//	public ModelAndView menu() {
//		
//	}

}

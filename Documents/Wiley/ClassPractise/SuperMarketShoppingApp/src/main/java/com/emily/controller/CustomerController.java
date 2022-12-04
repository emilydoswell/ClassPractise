package com.emily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emily.entity.Customer;

@Controller
public class CustomerController {
	
	@RequestMapping("/loginPage")
	public ModelAndView loginPageController() {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/login")
	public ModelAndView loginController(@ModelAttribute Customer customer) {
		return null;
		
	}
	
	@RequestMapping("/index")
	public ModelAndView menuController() {
		return new ModelAndView("index");
	}
	
}

package com.emily.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emily.entity.Customer;
import com.emily.model.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@RequestMapping("/")
	public ModelAndView loginPageController() {
		return new ModelAndView("Login");
	}
	
	@RequestMapping("/login")
	public ModelAndView loginController(@RequestParam("customerId") int id, @RequestParam("customerPassword") String password, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		
		Customer customer = service.checkLogin(id, password);
		
		if (customer != null) {
			session.setAttribute("customer", customer);		
			modelAndView.setViewName("Index");
		} else {
			modelAndView.setViewName("Login");
		}
		
		return modelAndView;
	}
	
	@RequestMapping("/index")
	public ModelAndView menuController() {
		return new ModelAndView("index");
	}
	
	
}

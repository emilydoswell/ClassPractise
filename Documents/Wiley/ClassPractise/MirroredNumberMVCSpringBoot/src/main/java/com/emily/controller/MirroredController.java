package com.emily.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emily.model.service.MirroredService;

@Controller
public class MirroredController {
	
	@Autowired
	MirroredService mirroredService;
	
	@RequestMapping("/")
	public ModelAndView mainPageController() {
		return new ModelAndView("Index");
	}
	

	@RequestMapping("/calculate")
	public ModelAndView calculateReverseController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		
		int number = Integer.parseInt(request.getParameter("num"));
		
		boolean palindrome = mirroredService.checkReverse(number);
		
		// Setting data for view
		modelAndView.addObject("message", palindrome);
		
		
		modelAndView.setViewName("Reverse");
		
		return modelAndView;	
	}
}

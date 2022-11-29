package com.emily.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emily.demo.model.service.WelcomeService;

@Controller
public class welcomeController {

	@Autowired
	WelcomeService welcomeService;
	
	@RequestMapping("/first")
	public ModelAndView myFirstController() {
		
		ModelAndView modelAndView = new ModelAndView();
		String greetMessage = welcomeService.welcome();
		
		modelAndView.addObject("morning", greetMessage);
		
		modelAndView.setViewName("Greet");
		return modelAndView;
	}
	
	@RequestMapping("/second")
	public ModelAndView mySecondController() {
		
		ModelAndView modelAndView = new ModelAndView();
		String greetMessage = welcomeService.exit();
		
		modelAndView.addObject("evening", greetMessage);
		
		modelAndView.setViewName("Greet");
		return modelAndView;
	}
 }

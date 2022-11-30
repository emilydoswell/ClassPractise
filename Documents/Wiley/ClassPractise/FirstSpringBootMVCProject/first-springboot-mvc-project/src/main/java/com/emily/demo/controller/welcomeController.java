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
	
	@RequestMapping("/morning")
	public ModelAndView myFirstController() {
		
		ModelAndView modelAndView = new ModelAndView();
		String greetMessage = welcomeService.welcome();
		
		// message is the string we input into the HTML
		modelAndView.addObject("message", greetMessage);
		
		// name of HTML file
		modelAndView.setViewName("Greet");
		return modelAndView;
	}
	
	@RequestMapping("/evening")
	public ModelAndView mySecondController() {
		
		ModelAndView modelAndView = new ModelAndView();
		String greetMessage = welcomeService.exit();
		
		modelAndView.addObject("message", greetMessage);
		
		modelAndView.setViewName("Greet");
		return modelAndView;
	}
 }

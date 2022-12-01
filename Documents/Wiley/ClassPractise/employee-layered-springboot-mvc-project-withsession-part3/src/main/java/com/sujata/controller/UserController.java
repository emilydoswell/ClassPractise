package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/loginPage")
	public ModelAndView menuController() {
		return new ModelAndView("login");
		
	}
}

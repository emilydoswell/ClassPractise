package com.emily.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emily.entity.Account;
import com.emily.model.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService service;
	
	@RequestMapping("/")
	public ModelAndView loginPageController() {
		// "Login" - This is the HTML page that we want to connect to
		// "account" - Connects to th:object in the HTML form
		// new Account(); - Creates a new Account with the id and password inputed by user
		return new ModelAndView("Login", "account", new Account());
	}
	
	
	@RequestMapping("/login")
									// Passing in an Account object generated above                                                                               <!-- so that we can use session -->
	public ModelAndView loginController(@ModelAttribute("account") Account account, @RequestParam("accountId") int accountId, @RequestParam("userPassword") String userPassword, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		
		Account newAccount = new Account();
		newAccount.setAccountId(accountId);
		newAccount.setUserPassword(userPassword);
		
		// If the inputed id+password match an existing pair then....
		if (service.loginCheck(account)) {
			
			session.setAttribute("account", newAccount);
			
			// Go to index page
			modelAndView.setViewName("index");
		} else {
			
			// Return to login page
			modelAndView.setViewName("login");
		}
		
		return modelAndView;
	}
	
	@RequestMapping("/index")
	public ModelAndView menuPageController() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/InputIdForSearch")
	public ModelAndView searchAccountByIdInputPage() {
		return new ModelAndView("InputIdForSearch");
	}
	
	@RequestMapping("/AccountView")
	public ModelAndView searchAccountByIdInputPage(@RequestParam("accountId") int accountId){
		ModelAndView modelAndView = new ModelAndView();
		
		Account newAccount = service.findByAccountId(accountId);
		
		if (newAccount != null) {	
			modelAndView.addObject("account", newAccount);
			modelAndView.setViewName("accountView");
		} else {
			modelAndView.addObject("message", "No user found with that ID");
			modelAndView.setViewName("Output");
		} 
		
		return modelAndView;
	}
	
	@RequestMapping("/UpdateBalancePage")
	public ModelAndView updateBalancePageController() {
		return new ModelAndView("InputIdForTransfer");
	}
	
	@RequestMapping("/UpdateBalance")
	public ModelAndView updateBalanceController() {
		
	}

}












package com.emily.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emily.entity.Product;
import com.emily.model.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService service;

	@RequestMapping("/listProducts")
	public ModelAndView getAllProductsController() {
		ModelAndView modelAndView = new ModelAndView();
		
		List<Product> productList = service.getAllProducts();
		
		modelAndView.addObject("product", productList);
		modelAndView.setViewName("listProducts");
		
		return modelAndView;
		
	}
	
	@RequestMapping("/receiptPage")
	public ModelAndView generateBill() {
		return new ModelAndView("receipt");
	}
}

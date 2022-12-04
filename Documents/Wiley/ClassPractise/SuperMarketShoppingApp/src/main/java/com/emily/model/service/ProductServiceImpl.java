package com.emily.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emily.entity.Product;
import com.emily.model.persistence.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;
	
	@Override
	public List<Product> getAllProducts() {
		return dao.findAll();
	}

}

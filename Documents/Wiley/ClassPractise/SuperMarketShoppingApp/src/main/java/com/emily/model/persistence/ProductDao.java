package com.emily.model.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emily.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, String> {
	
	public List<Product> findAll();
}

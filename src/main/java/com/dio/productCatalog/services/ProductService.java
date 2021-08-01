package com.dio.productCatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dio.productCatalog.entities.Product;
import com.dio.productCatalog.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional
	public Product create(Product product) {
		Product newProduct = repository.save(product);
		return newProduct;
	}
}

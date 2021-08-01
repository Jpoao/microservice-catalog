package com.dio.productCatalog.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dio.productCatalog.entities.Product;
import com.dio.productCatalog.repositories.ProductRepository;
import com.dio.productCatalog.services.exceptions.EntityNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional
	public Product create(Product product) {
		Product newProduct = repository.save(product);
		return newProduct;
	}
	
	@Transactional(readOnly = true)
	public Product findById(Integer id) {
		Optional<Product> foundEntity = repository.findById(id);
		return foundEntity.orElseThrow(() -> new EntityNotFoundException("id " + id + " not found"));
	}
}

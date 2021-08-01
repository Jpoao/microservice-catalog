package com.dio.productCatalog.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dio.productCatalog.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

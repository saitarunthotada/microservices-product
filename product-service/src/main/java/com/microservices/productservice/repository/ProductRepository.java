package com.microservices.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product,String> {
    
}

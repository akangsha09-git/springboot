package com.project.ak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ak.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

    Product findProductByProductName(String name);
    
}

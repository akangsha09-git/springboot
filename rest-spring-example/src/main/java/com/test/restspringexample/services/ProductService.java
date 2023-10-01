package com.test.restspringexample.services;
import java.util.List;

import com.test.restspringexample.model.Product;  
public interface ProductService {
    public List<Product> getProductList();
    public Product getProductById(int id);
}

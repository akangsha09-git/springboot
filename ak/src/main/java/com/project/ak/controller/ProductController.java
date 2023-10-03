package com.project.ak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.ak.entities.Product;
import com.project.ak.services.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @PostMapping(value = "/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PostMapping(value = "/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }
    @GetMapping(value = "/product/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping(value = "/products")
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }

    @GetMapping(value = "/product/{name}")
    public Product findProductByProductName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @PutMapping(value = "/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping(value = "/delete")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }
}

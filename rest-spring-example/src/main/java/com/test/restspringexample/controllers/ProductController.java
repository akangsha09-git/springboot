package com.test.restspringexample.controllers;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.restspringexample.model.Product;
import com.test.restspringexample.services.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
   
    @Autowired
 //   @Qualifier(value = "")
    private ProductService productService;

    @GetMapping(value = "/getall")
    public List<Product> getProduct()
    {
        List<Product> products= productService.getProductList();        
    
        return products;
    }

    @GetMapping(value = "/get")
    public Product getProductById(@RequestParam int id){
        Product product = productService.getProductById(id);
        return product;
    }
    @GetMapping(value = "/get/{id}")
    public Product getProductById1(@PathVariable int id){
        Product product = productService.getProductById(id);
         return product;
    }
}

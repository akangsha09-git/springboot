package com.test.restspringexample.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.restspringexample.model.Product;
import com.test.restspringexample.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

   @Override
   public  List<Product> getProductList()
   {
      ArrayList<Product> products = new ArrayList<Product>();

      products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));  
      products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));  
      products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));  
      products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));  
      products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));  
      products.add(new Product(105, "Refrigerator ", "12WP9087", 10000.00, 4));  

      return products;
   }    
   @Override
   public Product getProductById(int id){
      Product result = null;
       List<Product> products = getProductList();
       Optional<Product> pd = products.stream().filter(product -> (id == product.getId())).findFirst();
       if(pd.isPresent()){
         result= pd.get();
       }
       pd.if
      return result;
   }
}

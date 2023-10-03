package com.project.ak.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ak.entities.Product;
import com.project.ak.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired(required = false)
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
        }

    public List<Product> saveProducts(List<Product> products){
        return productRepository.saveAll(products);
        }
        
    public List<Product> getProducts(){
        return productRepository.findAll();
        }

    public Product getProductById(int id){
        return productRepository.findById(id).orElse(null);
        }

    public Product getProductByName(String name){
        return productRepository.findProductByProductName(name);
        }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "product removed: " +id;
    }

    public Product updateProduct(Product product){
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        
        existingProduct.setProductName(product.getProductName());
        existingProduct.setBatchNumber(product.getBatchNumber());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setNoOfProduct(product.getNoOfProduct());
        return productRepository.save(existingProduct);
    }
}

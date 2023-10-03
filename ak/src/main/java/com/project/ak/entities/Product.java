package com.project.ak.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "PRODUCT_NAME")
    private String productName;

    @Column(name= "BATCH_NUMBER")
    private String batchNumber;
    
    @Column(name= "PRICE")
    private double price;

    @Column(name= "NO_OF_PRODUCT")
    private String noOfProduct;
}

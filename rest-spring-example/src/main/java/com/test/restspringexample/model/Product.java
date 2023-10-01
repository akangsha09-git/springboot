package com.test.restspringexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String pname;
    private String batchno;
    private double price;
    private int noofproduct;
}

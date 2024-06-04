package com.prisc.product_management.entity;

import jakarta.persistence.Entity;

import java.util.UUID;

@Entity
public class Product {

    private UUID productId;
    private String name;
    private Double price;
    private String description;

}

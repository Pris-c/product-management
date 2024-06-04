package com.prisc.product_management.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Product {

    private UUID productId;
    private String name;
    private Double price;
    private String description;

}

package com.productInformation.productInformation.doa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String productName; // Changed to lowercase
    String productCost; // Changed to lowercase
    String productBrand; // Changed to lowercase
}

package com.productInformation.productInformation.services;

import com.productInformation.productInformation.doa.ProductInfo;

import java.util.List;
import java.util.Optional;

public interface ProductServis {
    ProductInfo create(ProductInfo productInfo);
    List<ProductInfo> getAll();
    Optional<ProductInfo> findById(int id);
    void findAndDeletById(int Id);
    void deletAll(ProductInfo productInfo);

}

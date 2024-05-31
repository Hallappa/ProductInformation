package com.productInformation.productInformation.repositry;

import com.productInformation.productInformation.doa.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<ProductInfo,Integer> {
}

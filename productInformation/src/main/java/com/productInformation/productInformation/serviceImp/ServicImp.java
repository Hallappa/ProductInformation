package com.productInformation.productInformation.serviceImp;

import com.productInformation.productInformation.doa.ProductInfo;
import com.productInformation.productInformation.repositry.Repository;
import com.productInformation.productInformation.services.ProductServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicImp implements ProductServis {
    @Autowired
    private Repository repository;
    @Override
    public ProductInfo create(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public List<ProductInfo> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ProductInfo> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void findAndDeletById(int Id) {
         repository.deleteById(Id);
    }

    @Override
    public void deletAll(ProductInfo productInfo) {
         repository.deleteAll();

    }
}

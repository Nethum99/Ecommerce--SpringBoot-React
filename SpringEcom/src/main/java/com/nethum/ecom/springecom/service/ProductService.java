package com.nethum.ecom.springecom.service;

import com.nethum.ecom.springecom.model.Product;
import com.nethum.ecom.springecom.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();

    }
}

package com.nishant.Ecommerce.service;

import com.nishant.Ecommerce.model.Product;
import com.nishant.Ecommerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public String addProduct(Product product) {
        return repo.save(product).toString();
    }
}

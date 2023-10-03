package com.nishant.Ecommerce.service;

import com.nishant.Ecommerce.model.Product;
import com.nishant.Ecommerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public String addProduct(ArrayList<Product> products) {
        products.forEach((product)->{
            product.setId(null);
        });
        return repo.saveAll(products).toString();
    }
}

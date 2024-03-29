package com.nishant.Ecommerce.controller;

import com.nishant.Ecommerce.model.Product;
import com.nishant.Ecommerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    ProductService service;

    /*
    POST
     */

    @PostMapping()
    public String addProduct(@RequestBody @Valid ArrayList<Product> products){
        return service.addProduct(products);
    }
}

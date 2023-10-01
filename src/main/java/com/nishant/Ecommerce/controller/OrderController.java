package com.nishant.Ecommerce.controller;

import com.nishant.Ecommerce.model.Order;
import com.nishant.Ecommerce.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Autowired
    OrderService service;

    /*
    POST
     */

    @PostMapping()
    public String addOrder(@RequestBody @Valid Order order){
        return service.addOrder(order);
    }
}

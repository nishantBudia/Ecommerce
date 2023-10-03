package com.nishant.Ecommerce.controller;

import com.nishant.Ecommerce.model.Order;
import com.nishant.Ecommerce.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /*
    GET
     */

    @GetMapping
    public List<Order> getAllOrders(){
        return service.getAllOrders();
    }
}

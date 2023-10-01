package com.nishant.Ecommerce.service;

import com.nishant.Ecommerce.model.Order;
import com.nishant.Ecommerce.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepo repo;
    public String addOrder(Order order) {
        return repo.save(order).toString();
    }
}

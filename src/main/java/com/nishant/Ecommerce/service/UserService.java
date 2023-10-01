package com.nishant.Ecommerce.service;

import com.nishant.Ecommerce.model.User;
import com.nishant.Ecommerce.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo repo;
    public String addUser(User user) {
        return repo.save(user).toString();
    }
}

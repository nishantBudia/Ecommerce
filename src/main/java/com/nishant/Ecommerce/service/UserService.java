package com.nishant.Ecommerce.service;

import com.nishant.Ecommerce.model.User;
import com.nishant.Ecommerce.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserRepo repo;
    public String addUser(ArrayList<User> users) {
        users.forEach((user)->{
            user.setId(null);
        });
        return repo.saveAll(users).toString();
    }
}

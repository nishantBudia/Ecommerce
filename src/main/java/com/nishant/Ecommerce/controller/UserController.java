package com.nishant.Ecommerce.controller;

import com.nishant.Ecommerce.model.User;
import com.nishant.Ecommerce.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService service;

    /*
    POST
     */

    @PostMapping()
    public String addUser(@RequestBody @Valid ArrayList<User> users){
        return service.addUser(users);
    }

}

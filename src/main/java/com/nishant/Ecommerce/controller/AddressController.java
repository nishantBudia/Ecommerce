package com.nishant.Ecommerce.controller;

import com.nishant.Ecommerce.model.Address;
import com.nishant.Ecommerce.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    AddressService service;

    /*
    POST
     */

    @PostMapping()
    public String addAddress(@RequestBody @Valid Address address){
        return service.addService(address);
    }
}

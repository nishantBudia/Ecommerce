package com.nishant.Ecommerce.service;

import com.nishant.Ecommerce.model.Address;
import com.nishant.Ecommerce.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo repo;
    public String addService(Address address) {
        return repo.save(address).toString();
    }
}

package com.saurav.Mapping.Bidirectional.controller;

import com.saurav.Mapping.Bidirectional.model.oneToOne.Address;
import com.saurav.Mapping.Bidirectional.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class addressController {
    @Autowired
    AddressService addressService;
    @PostMapping
    public String addAddress(@RequestBody Address address){
            return addressService.addAddress(address);
    }
}

package com.saurav.MappingPractice.controller;

import com.saurav.MappingPractice.model.Address;
import com.saurav.MappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping
    public List<Address> getAddress(){
        return addressService.getAddress();
    }
    @GetMapping("/{studentID}")
    public Address getAddressByStudentID(@PathVariable Integer studentID){
        return addressService.getAddressByStudentID(studentID);
    }
    @PutMapping("/{addressID}")
    public String updateAddressByAddressID(@PathVariable Long addressID,@RequestBody Address address){
        return addressService.updateAddressByAddressID(addressID,address);
    }
    @DeleteMapping("/{addressID}")
    public String deleteAddressByAddressID(@PathVariable Long addressID){
        return addressService.deleteAddressByAddressID(addressID);
    }
}

package com.saurav.mapping.service.oneToOne;

import com.saurav.mapping.model.oneToOne.Address;
import com.saurav.mapping.repository.oneToOne.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public void addAddress(Address address) {
        addressRepo.save(address);
    }
}

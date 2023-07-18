package com.saurav.Mapping.Bidirectional.repository;

import com.saurav.Mapping.Bidirectional.model.oneToOne.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}

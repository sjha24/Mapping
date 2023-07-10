package com.saurav.mapping.repository.oneToOne;

import com.saurav.mapping.model.oneToOne.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Integer> {
}

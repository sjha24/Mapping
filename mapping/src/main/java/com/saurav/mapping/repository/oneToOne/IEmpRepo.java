package com.saurav.mapping.repository.oneToOne;

import com.saurav.mapping.model.oneToOne.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmpRepo extends CrudRepository<Employee,Integer> {
}

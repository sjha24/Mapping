package com.saurav.Mapping.Bidirectional.repository;

import com.saurav.Mapping.Bidirectional.model.oneToOne.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
}

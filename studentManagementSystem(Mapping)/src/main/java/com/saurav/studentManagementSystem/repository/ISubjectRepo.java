package com.saurav.studentManagementSystem.repository;

import com.saurav.studentManagementSystem.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface IDepartmentRepo extends CrudRepository<Department,Integer> {
}

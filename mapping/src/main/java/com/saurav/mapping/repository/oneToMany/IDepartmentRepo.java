package com.saurav.mapping.repository.oneToMany;

import com.saurav.mapping.model.oneToMany.Department;
import org.springframework.data.repository.CrudRepository;

public interface IDepartmentRepo extends CrudRepository<Department,Integer> {
}

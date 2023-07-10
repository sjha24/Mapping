package com.saurav.mapping.repository.manyToMany;

import com.saurav.mapping.model.manyToMany.Department_M_to_M;
import org.springframework.data.repository.CrudRepository;

public interface IDept_M_to_M extends CrudRepository<Department_M_to_M,Integer> {
}

package com.saurav.mapping.repository.manyToOne;

import com.saurav.mapping.model.manyToOne.Students;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Students,Integer> {
}

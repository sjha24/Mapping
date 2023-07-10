package com.saurav.mapping.repository.manyToOne;

import com.saurav.mapping.model.manyToOne.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher,Integer> {
}

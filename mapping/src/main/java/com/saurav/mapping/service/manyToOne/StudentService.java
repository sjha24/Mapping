package com.saurav.mapping.service.manyToOne;

import com.saurav.mapping.model.manyToOne.Students;
import com.saurav.mapping.repository.manyToOne.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudents(Students students) {
        if(students != null){
            studentRepo.save(students);
            return "Student added in our database";
        }
        return "This Student is not added in our database !!!";
    }
}

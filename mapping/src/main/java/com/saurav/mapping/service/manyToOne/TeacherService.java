package com.saurav.mapping.service.manyToOne;

import com.saurav.mapping.model.manyToOne.Teacher;
import com.saurav.mapping.repository.manyToOne.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    TeacherRepo teacherRepo;

    public String addTeacher(Teacher teacher) {
        if(teacher != null){
            teacherRepo.save(teacher);
            return "New Teacher Added in our database";
        }
        return "Not added";
    }
}

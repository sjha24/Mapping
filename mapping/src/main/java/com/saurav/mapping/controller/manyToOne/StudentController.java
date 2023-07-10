package com.saurav.mapping.controller.manyToOne;

import com.saurav.mapping.model.manyToOne.Students;
import com.saurav.mapping.service.manyToOne.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("student")
    public String addStudents(@RequestBody Students students){
        return studentService.addStudents(students);
    }
}

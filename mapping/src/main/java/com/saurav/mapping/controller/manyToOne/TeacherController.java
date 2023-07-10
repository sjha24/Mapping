package com.saurav.mapping.controller.manyToOne;

import com.saurav.mapping.model.manyToOne.Teacher;
import com.saurav.mapping.service.manyToOne.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @PostMapping("teacher")
    public String addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
}

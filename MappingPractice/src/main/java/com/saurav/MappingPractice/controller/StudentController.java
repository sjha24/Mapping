package com.saurav.MappingPractice.controller;
import com.saurav.MappingPractice.model.Student;
import com.saurav.MappingPractice.service.StudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/{studentID}")
    public Student getStudentByID(@PathVariable Integer studentID){
        return studentService.getStudentByID(studentID);
    }
    @PutMapping("/{studentID}")
    public String updateStudentByID(@PathVariable Integer studentID, @RequestBody Student student){
        return studentService.updateStudentByID(studentID,student);
    }
    @DeleteMapping("/{studentID}")
    public String deleteStudentByID(@PathVariable Integer studentID){
        return studentService.deleteStudentByID(studentID);
    }
}

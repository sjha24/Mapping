package com.saurav.MappingPractice.controller;

import com.saurav.MappingPractice.model.Book;
import com.saurav.MappingPractice.model.Course;
import com.saurav.MappingPractice.service.AddressService;
import com.saurav.MappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
    @GetMapping
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    @GetMapping("/{studentID}")
    public ResponseEntity<Course> getCourseByStudentID(@PathVariable Integer studentID){
        return courseService.getCourseByStudentID(studentID);
    }
    @PutMapping("/{studentID}")
    public ResponseEntity<Course> updateCourseByStudentID(@PathVariable Integer studentID, @RequestBody Course course){
        return courseService.updateCourseByStudentID(studentID,course);
    }
    @DeleteMapping("/{courseID}")
    public String deleteCourseByID(@PathVariable Integer courseID){
        return courseService.deleteCourseByCourseID(courseID);
    }
}

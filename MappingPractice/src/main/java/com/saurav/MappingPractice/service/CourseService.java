package com.saurav.MappingPractice.service;

import com.saurav.MappingPractice.controller.CourseController;
import com.saurav.MappingPractice.model.Book;
import com.saurav.MappingPractice.model.Course;
import com.saurav.MappingPractice.model.Student;
import com.saurav.MappingPractice.repository.ICourseRepo;
import com.saurav.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;
    @Autowired
    IStudentRepo studentRepo;

    public String addCourse(Course course) {
        if(course != null){
            courseRepo.save(course);
            return "Course saved in our database";
        }
        return "Database error occurred";
    }

    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    public ResponseEntity<Course> getCourseByStudentID(Integer studentID) {
        Course course = null;
        HttpStatus status;
        if(studentRepo.existsById(studentID)){
            Student student = studentRepo.findByStudentID(studentID);
            course = courseRepo.findFirstByStudentList(student);
            status = HttpStatus.ACCEPTED;
        }
        status = HttpStatus.NOT_ACCEPTABLE;
        return new ResponseEntity<>(course,status);
    }

    public ResponseEntity<Course> updateCourseByStudentID(Integer studentID, Course course) {
        Course oldCourse = null;
        HttpStatus status;
        if(studentRepo.existsById(studentID)){
            Student student = studentRepo.findByStudentID(studentID);
            oldCourse = courseRepo.findFirstByStudentList(student);
            oldCourse.setCourseTitle(course.getCourseTitle());
            oldCourse.setCourseDescription(course.getCourseDescription());
            oldCourse.setCourseDuration(course.getCourseDuration());
            courseRepo.save(oldCourse);
            status = HttpStatus.ACCEPTED;
        }
        status = HttpStatus.NOT_ACCEPTABLE;
        return new ResponseEntity<>(oldCourse,status);
    }

    public String deleteCourseByCourseID(Integer courseID) {
        if(courseRepo.existsById(courseID)){
            courseRepo.deleteById(courseID);
            return "Deleted successfull";
        }
        return "Not deleted please enter valid course ID";
    }
}

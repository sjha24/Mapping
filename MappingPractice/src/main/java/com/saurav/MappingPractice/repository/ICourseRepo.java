package com.saurav.MappingPractice.repository;

import com.saurav.MappingPractice.model.Book;
import com.saurav.MappingPractice.model.Course;
import com.saurav.MappingPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Integer> {
    Course findFirstByStudentList(Student student);
}

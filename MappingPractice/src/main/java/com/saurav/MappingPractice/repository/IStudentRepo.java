package com.saurav.MappingPractice.repository;

import com.saurav.MappingPractice.model.Book;
import com.saurav.MappingPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Integer> {
    Student findByStudentID(Integer studentID);
}

package com.saurav.MappingPractice.repository;

import com.saurav.MappingPractice.model.Book;
import com.saurav.MappingPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IBookRepo extends JpaRepository<Book,Integer> {
    Book findFirstByStudent(Optional<Student> student);

    Book findFirstByBookID(Integer bookID);
}

package com.saurav.MappingPractice.repository;

import com.saurav.MappingPractice.model.Book;
import com.saurav.MappingPractice.model.Laptop;
import com.saurav.MappingPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Integer> {
    Laptop findFirstByStudent(Student student);

    Laptop findFirstByLaptopID(Laptop laptop);
}

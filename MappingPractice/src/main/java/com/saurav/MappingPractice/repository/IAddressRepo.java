package com.saurav.MappingPractice.repository;

import com.saurav.MappingPractice.model.Address;
import com.saurav.MappingPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAddressRepo extends JpaRepository<Address,Long> {
    Address findFirstByStudent(Optional<Student> student);

    Address findFirstByAddressID(Long addressID);
}

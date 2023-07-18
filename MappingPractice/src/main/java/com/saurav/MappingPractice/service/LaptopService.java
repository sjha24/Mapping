package com.saurav.MappingPractice.service;

import com.saurav.MappingPractice.model.Laptop;
import com.saurav.MappingPractice.model.Student;
import com.saurav.MappingPractice.repository.ILaptopRepo;
import com.saurav.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;
    @Autowired
    IStudentRepo studentRepo;
    public String addLaptop(Laptop laptop) {
        if(laptop != null){
            laptopRepo.save(laptop);
            return "Laptop added in our database";
        }
        return "Database error Occurred !!!";
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }
    public Optional<Laptop> getLaptopByID(Integer laptopID) {
        if(laptopRepo.existsById(laptopID)){
            return laptopRepo.findById(laptopID);
        }
        return null;
    }

    public Laptop getLaptopByStudentID(Integer studentID) {
        if(studentRepo.existsById(studentID)){
            Student student = studentRepo.findByStudentID(studentID);
            Laptop ExistLaptop = laptopRepo.findFirstByStudent(student);
            return ExistLaptop;
        }
        return null;
    }

    public String updateLaptopByID(Integer laptopID ,Laptop laptop) {
        if(laptopRepo.existsById(laptopID)){
            Laptop oldLaptop = laptopRepo.findFirstByLaptopID(laptop);
            oldLaptop.setLaptopName(laptop.getLaptopName());
            oldLaptop.setLaptopBrand(laptop.getLaptopBrand());
            oldLaptop.setLaptopPrice(laptop.getLaptopPrice());
            laptopRepo.save(oldLaptop);
            return "Laptop updated successfull";
        }
        return "Please Enter valid Laptop ID !!!";
    }

    public String deleteLaptopByID(Integer laptopID) {
        if(laptopRepo.existsById(laptopID)){
            laptopRepo.deleteById(laptopID);
            return "Id of this laptop "+laptopID+" remove successfull from our database";
        }
        return "Please enter valid laptop ID !!!";
    }
}

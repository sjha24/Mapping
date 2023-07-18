package com.saurav.MappingPractice.controller;

import com.saurav.MappingPractice.model.Laptop;
import com.saurav.MappingPractice.model.Student;
import com.saurav.MappingPractice.service.AddressService;
import com.saurav.MappingPractice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping()
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }
    @GetMapping
    private List<Laptop>getAllLaptops(){
        return laptopService.getAllLaptops();
    }
    @GetMapping("/{laptopID}")
    public Optional<Laptop> getLaptopByID(@PathVariable Integer laptopID){
        return laptopService.getLaptopByID(laptopID);
    }

    @GetMapping("/student/{studentID}")
    public Laptop getLaptopByStudentID(@PathVariable Integer studentID){
        return laptopService.getLaptopByStudentID(studentID);
    }
    @PutMapping("/{laptopID}")
    public String updateLaptopByID(@PathVariable Integer laptopID , @RequestBody Laptop laptop){
        return laptopService.updateLaptopByID(laptopID,laptop);
    }
    @DeleteMapping("/{laptopID}")
    public String deleteBookByBookID(@PathVariable Integer laptopID){
        return laptopService.deleteLaptopByID(laptopID);
    }
}

package com.saurav.Mapping.Bidirectional.controller;
import com.saurav.Mapping.Bidirectional.model.oneToOne.Employee;
import com.saurav.Mapping.Bidirectional.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmpController {
    @Autowired
    EmpService empService;
    @PostMapping()
    public String addEmp(@RequestBody Employee employee){
        return empService.addEmp(employee);
    }
}

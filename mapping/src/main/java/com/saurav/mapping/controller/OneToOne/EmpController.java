package com.saurav.mapping.controller.OneToOne;

import com.saurav.mapping.model.oneToOne.Employee;
import com.saurav.mapping.service.oneToOne.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;
    @PostMapping("Employee")
    public void addEmployee(@RequestBody Employee employee){
        empService.addEmployee(employee);
    }
}

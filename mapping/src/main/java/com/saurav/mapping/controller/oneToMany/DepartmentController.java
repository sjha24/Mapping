package com.saurav.mapping.controller.oneToMany;

import com.saurav.mapping.model.oneToMany.Department;
import com.saurav.mapping.service.oneToMany.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @PostMapping("Depart")
    public String addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }
}

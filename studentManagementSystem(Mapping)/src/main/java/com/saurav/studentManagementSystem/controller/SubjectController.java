package com.saurav.studentManagementSystem.controller;

import com.saurav.studentManagementSystem.service.DepaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    DepaService depaService;
}

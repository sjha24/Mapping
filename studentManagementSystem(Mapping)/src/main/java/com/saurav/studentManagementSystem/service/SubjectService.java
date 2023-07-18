package com.saurav.studentManagementSystem.service;

import com.saurav.studentManagementSystem.repository.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepaService {
    @Autowired
    IDepartmentRepo departmentRepo;
}

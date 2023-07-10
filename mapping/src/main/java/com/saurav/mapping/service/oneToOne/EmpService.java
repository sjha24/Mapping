package com.saurav.mapping.service.oneToOne;

import com.saurav.mapping.model.oneToOne.Employee;
import com.saurav.mapping.repository.oneToOne.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    IEmpRepo empRepo;
    public void addEmployee(Employee employee) {
        empRepo.save(employee);
    }
}

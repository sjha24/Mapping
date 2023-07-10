package com.saurav.mapping.service.oneToMany;

import com.saurav.mapping.model.oneToMany.Department;
import com.saurav.mapping.repository.oneToMany.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    IDepartmentRepo departmentRepo;

    public String addDepartment(Department department) {
        if(department != null) {
            departmentRepo.save(department);
            return "Department saved your data";
        }
        return "Error !!!";
    }
}

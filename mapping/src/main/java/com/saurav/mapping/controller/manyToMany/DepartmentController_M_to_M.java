package com.saurav.mapping.controller.manyToMany;

import com.saurav.mapping.model.manyToMany.Department_M_to_M;
import com.saurav.mapping.service.manyToMany.Dept_M_to_MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dept_M")
public class DepartmentController_M_to_M {
    @Autowired
    Dept_M_to_MService dept_m_to_mService;
    @PostMapping()
    public String addDept(@RequestBody Department_M_to_M departmentMToM){
        return  dept_m_to_mService.addDept(departmentMToM);
    }
    @PostMapping("/special")
    public String addDeptSpecial(@RequestBody Department_M_to_M departmentMToM){
        return dept_m_to_mService.addDepartmentSpecial(departmentMToM);
    }
}

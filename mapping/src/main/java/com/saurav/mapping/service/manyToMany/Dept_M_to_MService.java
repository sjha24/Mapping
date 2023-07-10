package com.saurav.mapping.service.manyToMany;

import com.saurav.mapping.model.manyToMany.Department_M_to_M;
import com.saurav.mapping.model.manyToMany.Worker_M_to_M;
import com.saurav.mapping.repository.manyToMany.IDept_M_to_M;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Dept_M_to_MService {
    @Autowired
    IDept_M_to_M deptMToM;
    public String addDept(Department_M_to_M departmentMToM) {
        if(departmentMToM != null){
            deptMToM.save(departmentMToM);
            return "Your department is update";
        }
        return "Not saved !!!";
    }

    public String addDepartmentSpecial(Department_M_to_M departmentMToM) {
        Integer departmentID = departmentMToM.getDepartmentID();
        Department_M_to_M deptDB = deptMToM.findById(departmentID).orElse(null);
        List<Worker_M_to_M>ExistWorkers = deptDB.getWorkers();
        List<Worker_M_to_M>newWorker = departmentMToM.getWorkers();
        newWorker.addAll(ExistWorkers);
        deptMToM.save(departmentMToM);
        return "Department added with special treatment";
    }
}

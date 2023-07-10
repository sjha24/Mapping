package com.saurav.mapping.service.manyToMany;

import com.saurav.mapping.model.manyToMany.Worker_M_to_M;
import com.saurav.mapping.repository.manyToMany.IWorker_M_to_M;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Worker_M_to_MService {
    @Autowired
    IWorker_M_to_M iWorkerMToM;
    public String addWorkers(Worker_M_to_M workerMToM) {
        if(workerMToM != null){
            iWorkerMToM.save(workerMToM);
            return "Worker list update";
        }
        return "not update !!!";
    }
}
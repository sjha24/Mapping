package com.saurav.mapping.service.oneToMany;

import com.saurav.mapping.model.oneToMany.Worker;
import com.saurav.mapping.repository.oneToMany.IWorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
    @Autowired
    IWorkerRepo workerRepo;

    public String addWorker(Worker workers) {
        if(workers != null){
            workerRepo.save(workers);
            return "New Worker added in our database";
        }
        return "Not added something going to wrong";
    }
}
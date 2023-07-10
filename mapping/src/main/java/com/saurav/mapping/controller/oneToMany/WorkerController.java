package com.saurav.mapping.controller.oneToMany;

import com.saurav.mapping.model.oneToMany.Worker;
import com.saurav.mapping.service.oneToMany.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerController {
    @Autowired
    WorkerService workerService;
    @PostMapping("worker")
    public String addWorker(@RequestBody Worker workers){
        return workerService.addWorker(workers);
    }
}

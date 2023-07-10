package com.saurav.mapping.controller.manyToMany;
import com.saurav.mapping.model.manyToMany.Worker_M_to_M;
import com.saurav.mapping.service.manyToMany.Worker_M_to_MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("worker_M")
public class WorkerController_M_to_M {
    @Autowired
    Worker_M_to_MService workerMToMService;
    @PostMapping()
    public String addWorkers(@RequestBody Worker_M_to_M workerMToM){
        return workerMToMService.addWorkers(workerMToM);
    }
}

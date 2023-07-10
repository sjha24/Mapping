package com.saurav.mapping.repository.oneToMany;

import com.saurav.mapping.model.oneToMany.Worker;
import org.springframework.data.repository.CrudRepository;

public interface IWorkerRepo extends CrudRepository<Worker,Integer> {
}

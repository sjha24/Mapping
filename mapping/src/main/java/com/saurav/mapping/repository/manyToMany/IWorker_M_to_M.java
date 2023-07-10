package com.saurav.mapping.repository.manyToMany;

import com.saurav.mapping.model.manyToMany.Worker_M_to_M;
import org.springframework.data.repository.CrudRepository;

public interface IWorker_M_to_M extends CrudRepository<Worker_M_to_M,Integer> {
}

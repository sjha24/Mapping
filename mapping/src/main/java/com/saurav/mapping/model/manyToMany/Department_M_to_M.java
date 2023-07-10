package com.saurav.mapping.model.manyToMany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department_M_to_M {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentID;
    private String departmentName;
    @ManyToMany
    @JoinTable(name = "department worker join table",joinColumns = @JoinColumn(name = "fk_dept_ID"),inverseJoinColumns = @JoinColumn(name = "fk_worker_ID"))
    List<Worker_M_to_M>workers;
}

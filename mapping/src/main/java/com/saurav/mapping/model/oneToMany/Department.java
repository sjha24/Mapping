package com.saurav.mapping.model.oneToMany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer department_Id;
    private String department_Name;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_dept_ID")
    List<Worker>workers;
}

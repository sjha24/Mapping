package com.saurav.Mapping.Bidirectional.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer EmpID;
    private String EmpName;
    @OneToOne
    @JoinColumn(name = "fk_address_ID")
    Address address;
}

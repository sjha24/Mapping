package com.saurav.mapping.model.oneToOne;

import com.saurav.mapping.model.oneToOne.Address;
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
    private Integer emp_ID;
    private String emp_Name;
    @OneToOne
    @JoinColumn(name = "FK_addressID")
    Address address;
}

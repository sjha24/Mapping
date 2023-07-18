package com.saurav.MappingPrectice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
    private String laptopID;
    private String laptopName;
    private String laptopBrand;
    private String laptopPrice;
    @OneToOne
    @JoinColumn(name = "fk_student_ID")
    private Student student;
}

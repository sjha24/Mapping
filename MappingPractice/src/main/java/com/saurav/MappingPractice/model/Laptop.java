package com.saurav.MappingPractice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopID;
    private String laptopName;
    private String laptopBrand;
    private String laptopPrice;
    @OneToOne
    @JoinColumn(name = "fk_student_ID")
    private Student student;
}

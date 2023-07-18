package com.saurav.MappingPractice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressID;
    private String addressLandmark;
    private String addressZipcode;
    private String addressDistrict;
    private String addressState;
    private String addressCountry;
    @OneToOne
    @JoinColumn(name = "fk_student_ID")
    private Student student;
}

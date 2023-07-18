package com.saurav.MappingPractice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseID;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;
    @ManyToMany
    @JoinTable(name = "fk_Student_Course_table",joinColumns = @JoinColumn(name = "fk_course_ID"),inverseJoinColumns = @JoinColumn(name = "fk_student_ID"))
    List<Student>studentList;
}

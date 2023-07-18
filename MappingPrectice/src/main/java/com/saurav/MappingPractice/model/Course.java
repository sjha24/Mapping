package com.saurav.MappingPrectice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    private String courseID;
    private String courseName;
    private String courseDescription;
    private String courseDuration;
    @ManyToMany
    @JoinTable(name = "fk_Student_Course_table",joinColumns = @JoinColumn(name = "fk_course_ID"),inverseJoinColumns = @JoinColumn(name = "fk_student_ID"))
    List<Student>studentList;
}

package com.saurav.MappingPrectice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    private String bookID;
    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;
    @ManyToOne
    @JoinColumn(name = "fk_student_ID")
    private Student student;
}

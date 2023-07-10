package com.saurav.mapping.model.manyToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_ID;
    private String student_Name;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_teacher_ID")
    Teacher teacher;
}

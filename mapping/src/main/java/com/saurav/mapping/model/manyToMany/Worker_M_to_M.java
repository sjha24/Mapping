package com.saurav.mapping.model.manyToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Worker_M_to_M {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer workerID;
    private String workerName;
}

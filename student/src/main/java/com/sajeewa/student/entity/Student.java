package com.sajeewa.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class Student {
    @Id
    @GeneratedValue

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

//    @ManyToOne
    private Integer schoolId;
}

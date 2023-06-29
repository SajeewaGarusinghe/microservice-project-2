package com.sajeewa.school.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
public class School {
    @Id
    @GeneratedValue

    private Integer id;
    private String name;
    private String email;

//    @ManyToOne
//    private List<Integer> studentIds;
}

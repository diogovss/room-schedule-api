package com.example.roomschedule.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Title title;

    @OneToMany(mappedBy = "professor")
    private List<Subject> subjects;
}
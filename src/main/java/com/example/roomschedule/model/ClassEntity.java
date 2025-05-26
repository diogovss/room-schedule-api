package com.example.roomschedule.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "class")
@Data
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Subject subject;

    private int year;
    private String semester;
    private String code;
}
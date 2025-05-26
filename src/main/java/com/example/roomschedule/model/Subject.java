package com.example.roomschedule.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;
}
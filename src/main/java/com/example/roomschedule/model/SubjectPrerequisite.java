package com.example.roomschedule.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SubjectPrerequisite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "prerequisiteid")
    private Subject prerequisite;
}
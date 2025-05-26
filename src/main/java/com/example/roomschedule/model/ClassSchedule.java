package com.example.roomschedule.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
public class ClassSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ClassEntity klass;

    @ManyToOne
    private Room room;

    private String dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
}
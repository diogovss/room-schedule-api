package com.example.roomschedule.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
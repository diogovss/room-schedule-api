package com.example.roomschedule.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
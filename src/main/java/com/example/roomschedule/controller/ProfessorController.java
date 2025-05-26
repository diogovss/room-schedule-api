package com.example.roomschedule.controller;

import com.example.roomschedule.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/professor-hours")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public Map<String, Long> getProfessorHours() {
        return professorService.getProfessorHours();
    }
}
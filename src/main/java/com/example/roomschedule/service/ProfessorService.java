package com.example.roomschedule.service;

import com.example.roomschedule.model.ClassSchedule;
import com.example.roomschedule.repository.ClassScheduleRepository;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.*;

@Service
public class ProfessorService {

    private final ClassScheduleRepository classScheduleRepository;

    public ProfessorService(ClassScheduleRepository classScheduleRepository) {
        this.classScheduleRepository = classScheduleRepository;
    }

    public Map<String, Long> getProfessorHours() {
        List<ClassSchedule> schedules = classScheduleRepository.findAll();
        Map<String, Long> result = new HashMap<>();

        for (ClassSchedule schedule : schedules) {
            String professorName = schedule.getKlass().getSubject().getProfessor().getName(); // Exemplo (substituir por Professor real)
            long duration = Duration.between(schedule.getStartTime(), schedule.getEndTime()).toHours();

            result.merge(professorName, duration, Long::sum);
        }

        return result;
    }
}
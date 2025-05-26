package com.example.roomschedule.service;

import com.example.roomschedule.model.ClassSchedule;
import com.example.roomschedule.repository.ClassScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomService {

    private final ClassScheduleRepository classScheduleRepository;

    public RoomService(ClassScheduleRepository classScheduleRepository) {
        this.classScheduleRepository = classScheduleRepository;
    }

    public Map<String, Map<String, List<String>>> getRoomAvailability() {
        List<ClassSchedule> schedules = classScheduleRepository.findAll();
        Map<String, Map<String, List<String>>> roomAvailability = new HashMap<>();

        for (ClassSchedule schedule : schedules) {
            String room = "Sala " + schedule.getRoom().getId();
            String day = schedule.getDayOfWeek();
            String time = schedule.getStartTime() + " - " + schedule.getEndTime();

            roomAvailability
                    .computeIfAbsent(room, k -> new HashMap<>())
                    .computeIfAbsent(day, k -> new ArrayList<>())
                    .add(time);
        }

        return roomAvailability;
    }
}
package com.example.roomschedule.repository;

import com.example.roomschedule.model.ClassSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassScheduleRepository extends JpaRepository<ClassSchedule, Long> {
}
package com.example.roomschedule.repository;

import com.example.roomschedule.model.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassEntity, Long> {
}
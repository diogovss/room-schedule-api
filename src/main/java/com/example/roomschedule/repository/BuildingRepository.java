package com.example.roomschedule.repository;

import com.example.roomschedule.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}
package com.example.roomschedule.repository;

import com.example.roomschedule.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
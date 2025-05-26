package com.example.roomschedule.repository;

import com.example.roomschedule.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title, Long> {
}
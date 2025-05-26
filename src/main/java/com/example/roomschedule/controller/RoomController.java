package com.example.roomschedule.controller;

import com.example.roomschedule.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/room-availability")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public Map<String, Map<String, List<String>>> getRoomAvailability() {
        return roomService.getRoomAvailability();
    }
}
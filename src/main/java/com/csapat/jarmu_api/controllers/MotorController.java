package com.csapat.jarmu_api.controllers;

import com.csapat.jarmu_api.domain.Motor;
import com.csapat.jarmu_api.services.MotorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.csapat.jarmu_api.domain.Motor;
import com.csapat.jarmu_api.services.MotorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MotorController {

    private MotorService motorService = new MotorService();

    @GetMapping("/get-all-order-by-name-motor")
    public List<Motor> getAllOrderByName() {
        return motorService.getAllOrderByName();
    }

    @GetMapping("/all-motors")
    public List<Motor> getAllMotors() {
        return motorService.getAll();
    }
}

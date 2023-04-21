package com.csapat.jarmu_api.controllers;

import com.csapat.jarmu_api.domain.dtos.MotorDTO;
import com.csapat.jarmu_api.services.MotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MotorController {

    @Autowired
    private MotorService motorService;


//    @GetMapping("/get-all-order-by-name-motor")
//    public List<MotorDTO> getAllOrderByName() {
//        return motorService.getAllOrderByName();
//    }
//
//    @GetMapping("/all-motors")
//    public List<MotorDTO> getAllMotors() {
//        return motorService.getAll();
//    }

}

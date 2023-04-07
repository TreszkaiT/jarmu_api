package com.csapat.jarmu_api.repositories;

import com.csapat.jarmu_api.domain.Auto;
import com.csapat.jarmu_api.domain.Motor;

import java.util.List;

import com.csapat.jarmu_api.domain.Motor;

import java.util.List;

public class MotorRepository {

    private static List<Motor> motors = List.of(
            new Motor(1, "ducatti"),
            new Motor(1, "bmw"),
            new Motor(1, "honda"),
            new Motor(1, "suzuki ninja")
    );

    public List<Motor> getAll() {
        return motors;
    }
}

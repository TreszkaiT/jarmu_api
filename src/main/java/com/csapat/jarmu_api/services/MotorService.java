package com.csapat.jarmu_api.services;

import com.csapat.jarmu_api.domain.Motor;
import com.csapat.jarmu_api.repositories.MotorRepository;

import java.util.List;

public class MotorService {

    private MotorRepository motorRepository = new MotorRepository();

    public List<Motor> getAll() {
        return motorRepository.getAll();
    }
}

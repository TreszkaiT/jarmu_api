package com.csapat.jarmu_api.services;

import com.csapat.jarmu_api.domain.Auto;
import com.csapat.jarmu_api.domain.Motor;
import com.csapat.jarmu_api.repositories.AutoRepository;
import com.csapat.jarmu_api.repositories.MotorRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MotorService {

    private MotorRepository motorRepository = new MotorRepository();

    public List<Motor> getAllOrderByName() {
        return motorRepository.getAll()
                .stream()
                .sorted((a1, a2) -> a1.compareTo(a2))
                .collect(Collectors.toList());
    }

    public List<Motor> getAll() {
        return motorRepository.getAll();
    }
}

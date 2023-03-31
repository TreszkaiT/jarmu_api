package com.csapat.jarmu_api.services;

import com.csapat.jarmu_api.domain.Auto;
import com.csapat.jarmu_api.repositories.AutoRepository;

import java.util.List;
import java.util.stream.Collectors;

public class AutoService {

    private AutoRepository autoRepository = new AutoRepository();

    public List<Auto> getAllOrderByName() {
        return autoRepository.getAll()
                .stream()
                .sorted((a1, a2) -> a1.compareTo(a2))
                .collect(Collectors.toList());
    }
}

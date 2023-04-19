package com.csapat.jarmu_api.repositories;

import com.csapat.jarmu_api.domain.Auto;

import java.util.List;

public class AutoRepository {

    private static List<Auto> autos = List.of(
            new Auto(1, "suzuki"),
            new Auto(2, "bmw"),
            new Auto(3, "audi"),
            new Auto(4, "ferrari")
    );

    public List<Auto> getAll() {
        return autos;
    }
}

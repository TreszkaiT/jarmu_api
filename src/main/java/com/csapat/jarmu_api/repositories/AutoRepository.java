package com.csapat.jarmu_api.repositories;

import com.csapat.jarmu_api.domain.entities.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {

//    private static List<AutoDTO> autoDTOS = List.of(
//            new AutoDTO(1, "suzuki"),
//            new AutoDTO(2, "bmw"),
//            new AutoDTO(3, "audi"),
//            new AutoDTO(4, "ferrari")
//    );

//    public List<AutoDTO> getAll() {
//        return autoDTOS;
//    }
}

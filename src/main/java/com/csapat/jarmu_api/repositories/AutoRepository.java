package com.csapat.jarmu_api.repositories;

import com.csapat.jarmu_api.domain.entities.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer> {

    Optional<Auto> findByName(String name);
}

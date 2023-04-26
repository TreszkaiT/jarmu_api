package com.csapat.jarmu_api.services;

import com.csapat.jarmu_api.domain.dtos.AutoDTO;
import com.csapat.jarmu_api.domain.entities.Auto;
import com.csapat.jarmu_api.domain.exceptions.AutoNotFoundException;
import com.csapat.jarmu_api.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public List<AutoDTO> findAll() {
        List<Auto> autoList = autoRepository.findAll();

        return autoList.stream().map( (auto) -> {
            AutoDTO autoDTO = new AutoDTO();
            autoDTO.setId(auto.getId());
            autoDTO.setName(auto.getName());
            autoDTO.setPrice(auto.getPrice());
            autoDTO.setAge(auto.getAge());
            return autoDTO;
        } ).collect(Collectors.toList());
    }

    public List<AutoDTO> getAllOrderByName() {
        return autoRepository.findAll()
                .stream()
                .map((auto) -> {
                    AutoDTO autoDTO = new AutoDTO();
                    autoDTO.setId(auto.getId());
                    autoDTO.setName(auto.getName());
                    autoDTO.setPrice(auto.getPrice());
                    autoDTO.setAge(auto.getAge());
                    return autoDTO;
                } )
                .sorted((a1, a2) -> a1.compareTo(a2))
                .collect(Collectors.toList());
    }

    public AutoDTO findAutoByName(String autoName) throws AutoNotFoundException {
        Auto auto = autoRepository.findByName(autoName).orElseThrow(() -> new AutoNotFoundException());

        return AutoDTO.builder()
                .id(auto.getId())
                .name(auto.getName())
                .age(auto.getAge())
                .price(auto.getPrice())
                .build();
    }

    public List<AutoDTO> getAllOrderByAge() {
        return autoRepository.findAll()
                .stream()
                .map((auto) -> {
                    AutoDTO autoDTO = new AutoDTO();
                    autoDTO.setId(auto.getId());
                    autoDTO.setName(auto.getName());
                    autoDTO.setPrice(auto.getPrice());
                    autoDTO.setAge(auto.getAge());
                    return autoDTO;
                } )
                .sorted((a1, a2) -> a1.compareByAgeTo(a2))
                .collect(Collectors.toList());
    }

    public List<AutoDTO> getAllOrderByPrice() {
        return autoRepository.findAll()
                .stream()
                .map((auto) -> {
                    AutoDTO autoDTO = new AutoDTO();
                    autoDTO.setId(auto.getId());
                    autoDTO.setName(auto.getName());
                    autoDTO.setPrice(auto.getPrice());
                    autoDTO.setAge(auto.getAge());
                    return autoDTO;
                } )
                .sorted((a1, a2) -> a1.compareByPriceTo(a2))
                .collect(Collectors.toList());
    }
}

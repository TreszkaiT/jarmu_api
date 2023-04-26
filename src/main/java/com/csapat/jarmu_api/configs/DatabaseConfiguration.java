package com.csapat.jarmu_api.configs;

import com.csapat.jarmu_api.domain.entities.Auto;
import com.csapat.jarmu_api.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfiguration {

    @Autowired
    private AutoRepository autoRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void seedDatabase(){

        Auto auto = Auto.builder().name("Mercedes").age(19).price(600000).build();
        autoRepository.save(auto);

        Auto auto01 = Auto.builder().name("BMW").age(9).price(1600000).build();
        autoRepository.save(auto01);

        Auto auto02 = Auto.builder().name("Trabant").age(35).price(60000).build();
        autoRepository.save(auto02);

        Auto auto03 = Auto.builder().name("Audi").age(35).price(60000).build();
        autoRepository.save(auto03);

    }
}

package com.csapat.jarmu_api;


import com.csapat.jarmu_api.domain.dtos.AutoDTO;
import com.csapat.jarmu_api.services.AutoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AutoServiceTest {

    @Autowired
    private AutoService underTest;

    @Test
    public void getAllOrderByName_withElements_shouldReturnSortedList() {
        List<AutoDTO> cars = underTest.getAllOrderByName();

        assertEquals('a', cars.get(0).getName().charAt(0));
        assertEquals('s', cars.get(cars.size()-1).getName().charAt(0));
//        assertEquals('a', cars.get(cars.size()-1).getName().charAt(0));

    }
}

package com.csapat.jarmu_api;


import com.csapat.jarmu_api.domain.Auto;
import com.csapat.jarmu_api.services.AutoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AutoServiceTest {

    @Autowired
    private AutoService underTest;

    @Test
    public void getAllOrderByName_withElements_shouldReturnSortedList() {
        List<Auto> cars = underTest.getAllOrderByName();

        assertEquals('a', cars.get(0).getName().charAt(0));
        assertEquals('s', cars.get(cars.size()-1).getName().charAt(0));
//        assertEquals('a', cars.get(cars.size()-1).getName().charAt(0));

    }
}

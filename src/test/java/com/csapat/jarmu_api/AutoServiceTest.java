package com.csapat.jarmu_api;


import com.csapat.jarmu_api.domain.dtos.AutoDTO;
import com.csapat.jarmu_api.domain.entities.Auto;
import com.csapat.jarmu_api.domain.exceptions.AutoNotFoundException;
import com.csapat.jarmu_api.repositories.AutoRepository;
import com.csapat.jarmu_api.services.AutoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class AutoServiceTest {

    @Mock
    private AutoRepository autoRepository;

    @InjectMocks
    private AutoService underTest;

    @Captor
    private ArgumentCaptor<Auto> autoCaptor;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getAllOrderByName_withElements_shouldReturnSortedList() {
        Auto auto = Auto.builder().id(1).name("Mercedes").age(19).price(600000).build();
        Auto auto01 = Auto.builder().id(2).name("BMW").age(9).price(1600000).build();
        Auto auto02 = Auto.builder().id(3).name("Trabant").age(35).price(60000).build();
        List<Auto> autok = List.of(auto, auto01, auto02);

        Mockito.when(autoRepository.findAll()).thenReturn(autok);

        List<AutoDTO> cars = underTest.getAllOrderByName();

        assertEquals('B', cars.get(0).getName().charAt(0));
        assertEquals('T', cars.get(cars.size()-1).getName().charAt(0));

    }

    @Test
    public void findAutoByName_callWithDifferentNames_shouldReturnCorrectAutos() throws AutoNotFoundException {
        Auto auto = Auto.builder().id(1).name("Mercedes").age(19).price(600000).build();
        Auto auto01 = Auto.builder().id(2).name("BMW").age(9).price(1600000).build();
        Optional<Auto> autoOptional = Optional.of(auto);
        Optional<Auto> auto01Optional = Optional.of(auto01);

        Mockito.when(autoRepository.findByName(Mockito.eq("Mercedes"))).thenReturn(autoOptional);
        Mockito.when(autoRepository.findByName(Mockito.eq("BMW"))).thenReturn(auto01Optional);

        AutoDTO autoDTO = underTest.findAutoByName("Mercedes");

        assertEquals(autoDTO.getId(), auto.getId());
    }

    @Test
    public void findAutoByName_autoNameDoesNotExist_shouldThrowAutoNotFoundException() {
        Mockito.when(autoRepository.findByName(Mockito.eq("BMW"))).thenReturn(Optional.empty());

        assertThrows(AutoNotFoundException.class, () -> underTest.findAutoByName("BMW"));
    }

    @Test
    public void save_validAutoDto_shouldPassValidAutoEntityToRepository() {
        AutoDTO autoDTO = new AutoDTO();
        autoDTO.setAge(12);
        autoDTO.setName("BMW");
        autoDTO.setPrice(1000);

        underTest.save(autoDTO);
        Mockito.verify(autoRepository).save(autoCaptor.capture());
        Auto auto = autoCaptor.getValue();

        assertNull(auto.getId());
        assertEquals(auto.getName(), autoDTO.getName());
        assertEquals(auto.getAge(), autoDTO.getAge());
        assertEquals(auto.getPrice(), autoDTO.getPrice());
        assertInstanceOf(Auto.class, auto);
    }
}

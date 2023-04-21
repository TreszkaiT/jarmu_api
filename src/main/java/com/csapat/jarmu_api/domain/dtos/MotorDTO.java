package com.csapat.jarmu_api.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MotorDTO implements Comparable<MotorDTO> {

    private int id;
    private String name;

    private int price;

    private int age;

    @Override
    public int compareTo(MotorDTO o) {
        return name.compareTo(o.name);
    }
}

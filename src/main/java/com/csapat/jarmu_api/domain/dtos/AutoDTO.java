package com.csapat.jarmu_api.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoDTO implements Comparable<AutoDTO> {

    private int id;
    private String name;

    private int price;

    private int age;

    @Override
    public int compareTo(AutoDTO o) {
        return name.compareTo(o.name);
    }
}

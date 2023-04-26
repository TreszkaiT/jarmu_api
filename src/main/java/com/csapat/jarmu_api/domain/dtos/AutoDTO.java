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

    public int compareByPriceTo(AutoDTO o) {
        if (price < o.price) {
            return -1;
        } else if (price == o.price) {
            return 0;
        } else {
            return 1;
        }
    }

    public int compareByAgeTo(AutoDTO o) {
        if (age < o.age) {
            return -1;
        } else if (age == o.age) {
            return 0;
        } else {
            return 1;
        }
    }
}

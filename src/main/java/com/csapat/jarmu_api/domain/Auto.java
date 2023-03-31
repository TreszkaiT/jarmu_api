package com.csapat.jarmu_api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Auto implements Comparable<Auto> {

    private int id;
    private String name;

    @Override
    public int compareTo(Auto o) {
        return name.compareTo(o.name);
    }
}

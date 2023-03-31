package com.csapat.jarmu_api.controllers;

import com.csapat.jarmu_api.domain.Auto;
import com.csapat.jarmu_api.services.AutoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutoContoller {

    private AutoService autoService = new AutoService();

    @GetMapping("/get-all-order-by-name")
    public List<Auto> getAllOrderByName() {
        return autoService.getAllOrderByName();
    }
}

package com.csapat.jarmu_api.controllers;

import com.csapat.jarmu_api.domain.Auto;
import com.csapat.jarmu_api.services.AutoService;
import com.csapat.jarmu_api.domain.Auto;
import com.csapat.jarmu_api.services.AutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import java.util.List;

@RestController
public class AutoContoller {

    private AutoService autoService = new AutoService();

    @GetMapping("/get-all-order-by-name-auto")
    public List<Auto> getAllOrderByName() {
        return autoService.getAllOrderByName();
    }

    //"ide jön a controller"
    @RequestMapping(path = "/all", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Auto>> findAll() {return ResponseEntity.ok(autoService.findAll());}
}

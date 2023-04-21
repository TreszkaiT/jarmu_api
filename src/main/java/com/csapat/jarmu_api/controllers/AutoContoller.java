package com.csapat.jarmu_api.controllers;

import com.csapat.jarmu_api.domain.dtos.AutoDTO;
import com.csapat.jarmu_api.services.AutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
public class AutoContoller {

    private AutoService autoService = new AutoService();

    @GetMapping("/get-all-order-by-name-auto")
    public List<AutoDTO> getAllOrderByName() {
        return autoService.getAllOrderByName();
    }

    //"ide jön a controller"
    @RequestMapping(path = "/all", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<AutoDTO>> findAll() {return ResponseEntity.ok(autoService.findAll());}
}

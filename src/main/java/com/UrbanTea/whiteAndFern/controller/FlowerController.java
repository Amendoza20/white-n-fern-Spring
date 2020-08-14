package com.UrbanTea.whiteAndFern.controller;

import com.UrbanTea.whiteAndFern.model.Flower;
import com.UrbanTea.whiteAndFern.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@Controller
public class FlowerController {
    @Autowired
    private FlowerService service;

    @GetMapping("/flower/{id}")
    private ResponseEntity<Flower> findFlowerById(@PathVariable("id") long id, @Valid @RequestBody Flower flower){
        try {
            return new ResponseEntity<>(service.findFlowerById(id), HttpStatus.OK);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Flower not found");
        }
    }

    @GetMapping("/flower/{name}")
    private ResponseEntity<Flower> findFlowerByName(@PathVariable("name") String name, @Valid @RequestBody Flower flower){
        try {
            return new ResponseEntity<>(service.findFlowerByName(name), HttpStatus.OK);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Flower not found");
        }
    }

    @PostMapping("/addFlower")
    private ResponseEntity<Flower> addFlower(@Valid @RequestBody Flower flower) throws Exception {
        return new ResponseEntity<>(service.addFlower(flower), HttpStatus.CREATED);
    }

    @PutMapping("/flower/{id}")
    private ResponseEntity<Flower> updateFlower(@PathVariable("id") long id, @Valid @RequestBody Flower flower) {
        try {
            return new ResponseEntity<>(service.updateFlower(id, flower), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Flower not found");
        }
    }

    @DeleteMapping("/removeFlower/{id}")
    private ResponseEntity<Boolean> deleteFlower(@RequestParam long id) {
        return new ResponseEntity<>(service.deleteFlowerById(id), HttpStatus.OK);
    }
}

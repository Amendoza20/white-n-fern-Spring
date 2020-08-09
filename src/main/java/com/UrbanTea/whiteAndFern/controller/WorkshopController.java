package com.UrbanTea.whiteAndFern.controller;

import com.UrbanTea.whiteAndFern.model.Workshop;
import com.UrbanTea.whiteAndFern.service.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class WorkshopController {
    @Autowired
    private WorkshopService service;

    @GetMapping("/hello")
    private ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @PostMapping("/addWorkShop")
    private ResponseEntity<Workshop> addWorkshop(@Valid @RequestBody Workshop workshop) throws Exception {
        String title = workshop.getTitle();
        return new ResponseEntity<>(service.addWorkshop(workshop), HttpStatus.CREATED);
    }

    @PutMapping("/workshop/{title}")
    private ResponseEntity<Workshop> updateWorkshop(@PathVariable String title, @Valid @RequestBody Workshop workshop){
        return new ResponseEntity<>(service.updateWorkshop(title, workshop), HttpStatus.OK);
    }

    @DeleteMapping("/removeWorkshop")
    private ResponseEntity<Boolean> deleteWorkshop(@RequestParam Long id) {
        return new ResponseEntity<>(service.deleteWorkshop(id), HttpStatus.OK);
    }
    
}

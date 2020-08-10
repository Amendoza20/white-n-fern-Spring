package com.UrbanTea.whiteAndFern.controller;

import com.UrbanTea.whiteAndFern.model.GalleryItem;
import com.UrbanTea.whiteAndFern.service.GalleryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@Controller
public class GalleryItemController {

    @Autowired
    private GalleryItemService service;

    @GetMapping("/galleryItem/{id}")
    private ResponseEntity<GalleryItem> findGalleryItemById(@PathVariable("id") long id, @Valid @RequestBody GalleryItem item){
       try {
           return new ResponseEntity<>(service.findGalleryItemById(id), HttpStatus.OK);
       }catch (Exception e){
           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Gallery Item not found");
       }
    }

    @GetMapping("/galleryItem/{title}")
    private ResponseEntity<GalleryItem> findGalleryItemByTitle(@PathVariable("title") String title, @Valid @RequestBody GalleryItem item){
        try {
            return new ResponseEntity<>(service.findGalleryItemByTitle(title), HttpStatus.OK);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Gallery Item not found");
        }
    }

    @PostMapping("/addGalleryItem")
    private ResponseEntity<GalleryItem> addGalleryItem(@Valid @RequestBody GalleryItem item) throws Exception {
        String title = item.getTitle();
        return new ResponseEntity<>(service.addGalleryItem(item), HttpStatus.CREATED);
    }

    @PutMapping("/galleryItem/{id}")
    private ResponseEntity<GalleryItem> updateGalleryItem(@PathVariable("id") long id, @Valid @RequestBody GalleryItem item) {
       try {
           return new ResponseEntity<GalleryItem>(service.updateGalleryItem(id, item), HttpStatus.OK);
       }catch (Exception e){
           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Gallery Item not found");
       }
    }

    @DeleteMapping("removegalleryItem/{id}")
    private ResponseEntity<Boolean> deleteGalleryItem(@RequestParam long id) {
        return new ResponseEntity<>(service.deleteGalleryItemById(id), HttpStatus.OK);
    }
}

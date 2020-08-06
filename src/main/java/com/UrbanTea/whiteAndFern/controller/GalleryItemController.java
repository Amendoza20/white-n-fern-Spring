package com.UrbanTea.whiteAndFern.controller;

import com.UrbanTea.whiteAndFern.service.GalleryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GalleryItemController {

    @Autowired
    private GalleryItemService service;
}

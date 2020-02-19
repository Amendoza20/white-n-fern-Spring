package com.UrbanTea.whiteAndFern.Controller;

import com.UrbanTea.whiteAndFern.Service.galleryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class galleryItemController {
    @Autowired
    private galleryItemService service;
}

package com.UrbanTea.whiteAndFern.Controller;

import com.UrbanTea.whiteAndFern.Service.flowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class flowerController {
    @Autowired
    private flowerService service;
}

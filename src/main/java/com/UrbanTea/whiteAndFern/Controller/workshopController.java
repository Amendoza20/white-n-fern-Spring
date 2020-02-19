package com.UrbanTea.whiteAndFern.Controller;

import com.UrbanTea.whiteAndFern.Service.workshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class workshopController {
    @Autowired
    private workshopService service;
}

package com.UrbanTea.whiteAndFern.controller;

import com.UrbanTea.whiteAndFern.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FlowerController {
    @Autowired
    private FlowerService service;

}

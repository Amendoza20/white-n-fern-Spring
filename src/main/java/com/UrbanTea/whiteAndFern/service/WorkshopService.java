package com.UrbanTea.whiteAndFern.service;

import com.UrbanTea.whiteAndFern.repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkshopService {
    @Autowired
    WorkshopRepository repository;
}

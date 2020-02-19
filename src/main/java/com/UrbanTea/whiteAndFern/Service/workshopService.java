package com.UrbanTea.whiteAndFern.Service;

import com.UrbanTea.whiteAndFern.Repository.workshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class workshopService {
    @Autowired
    private workshopRepository repository;
}

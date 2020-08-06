package com.UrbanTea.whiteAndFern.service;

import com.UrbanTea.whiteAndFern.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository repository;
}

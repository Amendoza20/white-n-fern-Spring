package com.UrbanTea.whiteAndFern.Service;

import com.UrbanTea.whiteAndFern.Repository.flowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class flowerService {
    @Autowired
    private flowerRepository repository;
}

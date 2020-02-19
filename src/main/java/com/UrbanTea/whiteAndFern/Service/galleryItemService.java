package com.UrbanTea.whiteAndFern.Service;

import com.UrbanTea.whiteAndFern.Repository.galleryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class galleryItemService {
    @Autowired
    private galleryItemRepository repository;
}

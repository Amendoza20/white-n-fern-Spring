package com.UrbanTea.whiteAndFern.service;

import com.UrbanTea.whiteAndFern.repository.GalleryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalleryItemService {
    @Autowired
    private GalleryItemRepository repository;
}

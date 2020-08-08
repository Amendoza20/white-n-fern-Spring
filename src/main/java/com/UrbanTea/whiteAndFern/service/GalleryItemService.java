package com.UrbanTea.whiteAndFern.service;

import com.UrbanTea.whiteAndFern.model.GalleryItem;
import com.UrbanTea.whiteAndFern.repository.GalleryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalleryItemService {
    @Autowired
    private GalleryItemRepository repository;

    public GalleryItem addGalleryItem (GalleryItem item) throws Exception {

        if (repository.findGalleryItemByTitle(item.getTitle()) ==null) {
            item.setDescription(item.getDescription());
            item.setImagePath(item.getImagePath());
            return repository.save(item);
        }
        throw new Exception("Gallery Item already exists");
    }

    public GalleryItem findGalleryItemById (long id) {
        return repository.getOne(id);
    }

    public boolean deleteGalleryItemById (long id){
        GalleryItem item = findGalleryItemById(id);
        if (item !=null){
            repository.delete(item);
            return true;
        }
        return false;
    }
}

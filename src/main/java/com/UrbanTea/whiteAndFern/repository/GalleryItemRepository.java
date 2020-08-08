package com.UrbanTea.whiteAndFern.repository;

import com.UrbanTea.whiteAndFern.model.GalleryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryItemRepository extends JpaRepository<GalleryItem, Long> {
    GalleryItem findGalleryItemByTitle (String name);
}

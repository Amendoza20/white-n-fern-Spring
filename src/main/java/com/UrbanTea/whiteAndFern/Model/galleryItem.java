package com.UrbanTea.whiteAndFern.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class galleryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String imagePath;
    private String description;

    public galleryItem(long id, String title, String imagePath, String description) {
        this.id = id;
        this.title = title;
        this.imagePath = imagePath;
        this.description = description;
    }

    public galleryItem(String title, String imagePath, String description) {
        this.title = title;
        this.imagePath = imagePath;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

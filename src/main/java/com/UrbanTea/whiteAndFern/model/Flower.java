package com.UrbanTea.whiteAndFern.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String imagePath;

    public Flower(long id, String imagePath) {
        this.id = id;
        this.imagePath = imagePath;
    }

    public Flower(String imagePath) {
        this.imagePath = imagePath;
    }

    public long getId() {
        return id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}

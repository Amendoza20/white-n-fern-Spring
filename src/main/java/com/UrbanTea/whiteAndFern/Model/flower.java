package com.UrbanTea.whiteAndFern.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String imagePath;

    public flower(long id, String imagePath) {
        this.id = id;
        this.imagePath = imagePath;
    }

    public flower(String imagePath) {
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

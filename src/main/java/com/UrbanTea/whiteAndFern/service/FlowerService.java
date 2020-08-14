package com.UrbanTea.whiteAndFern.service;

import com.UrbanTea.whiteAndFern.model.Flower;
import com.UrbanTea.whiteAndFern.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {

    @Autowired
    private FlowerRepository repository;

    public Flower addFlower (Flower flower) throws Exception {

        if (repository.findFlowerByName(flower.getName()) ==null) {
            flower.setImagePath(flower.getImagePath());
            flower.setName(flower.getName());
            return  repository.save(flower);
        }
        throw new Exception ("Flower already exists");
    }

    public Flower findFlowerById (long id){
        return repository.getOne(id);
    }

    public Flower findFlowerByName(String name) { return repository.findFlowerByName(name);}

    public Flower updateFlower(long id, Flower flower){
        Flower OGFlower = repository.getOne(id);
        if(OGFlower.getName() !=null) {
            OGFlower.setName(flower.getName());
        }
        if(OGFlower.getImagePath() !=null){
            OGFlower.setImagePath(flower.getImagePath());
        }
        return repository.save(OGFlower);
    }

    public boolean deleteFlowerById (long id){
        Flower flower = findFlowerById(id);
        if (flower != null){
            repository.delete(flower);
            return true;
        }
        return false;
    }


}

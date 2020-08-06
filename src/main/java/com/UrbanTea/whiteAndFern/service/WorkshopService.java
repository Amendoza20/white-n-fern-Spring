package com.UrbanTea.whiteAndFern.service;

import com.UrbanTea.whiteAndFern.model.Workshop;
import com.UrbanTea.whiteAndFern.repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkshopService {
    @Autowired
    private WorkshopRepository repository;

    public Workshop addWorkshop (Workshop workshop) throws Exception {
        if(repository.findByTitle(workshop.getTitle()) ==null){
            workshop.setTitle(workshop.getTitle());
            workshop.setDate(workshop.getDate());
            workshop.setInfo(workshop.getInfo());
            workshop.setNumOfSeats(workshop.getNumOfSeats());
            workshop.setTime(workshop.getTime());
            return repository.save(workshop);
         }
        throw new Exception("Workshop event already exists");
    }
    public Workshop findById (Long id) {
       return repository.getOne(id);
    }

    public boolean deleteWorkshop (Long id) {
        Workshop workshop = findById(id);
        if (workshop != null) {
            repository.delete(workshop);
            return true;
        }
        return false;
    }
}

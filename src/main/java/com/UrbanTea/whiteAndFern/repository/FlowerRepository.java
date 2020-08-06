package com.UrbanTea.whiteAndFern.repository;

import com.UrbanTea.whiteAndFern.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {
    Flower findFlowerByName (String name);
}

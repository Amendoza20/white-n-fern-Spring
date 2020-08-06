package com.UrbanTea.whiteAndFern.repository;

import com.UrbanTea.whiteAndFern.model.Workshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRepository extends JpaRepository<Workshop, Long> {
    Workshop findByTitle(String title);
}

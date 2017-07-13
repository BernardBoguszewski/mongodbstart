package com.example.demo.repositories;

import com.example.demo.domain.Projekt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Britenet on 2017-07-13.
 */
@Repository
public interface ProjektRepository extends MongoRepository<Projekt, String> {
}

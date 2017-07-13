package com.example.demo.services;

import com.example.demo.domain.Projekt;
import com.example.demo.dtos.ProjektDto;
import com.example.demo.factories.ProjectFactory;
import com.example.demo.repositories.ProjektRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Britenet on 2017-07-13.
 */
@Service
public class ProjektService {

    private ProjektRepository projektRepository;
    private ProjectFactory projectFactory;


    public ProjektService(ProjektRepository projektRepository, ProjectFactory projectFactory) {
        this.projektRepository = projektRepository;
        this.projectFactory = projectFactory;
    }

    @Transactional
    public void createProject(ProjektDto projektDto) {
        Projekt projekt = projectFactory.create(projektDto);
        projektRepository.save(projekt);
    }

    @Transactional
    public List<Projekt> getAllProjects() {
        return projektRepository.findAll();
    }
}

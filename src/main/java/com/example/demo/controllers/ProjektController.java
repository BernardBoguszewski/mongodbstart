package com.example.demo.controllers;

import com.example.demo.domain.Projekt;
import com.example.demo.dtos.ProjektDto;
import com.example.demo.services.ProjektService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Britenet on 2017-07-13.
 */
@RestController
@RequestMapping("/projects")
public class ProjektController {

    private ProjektService projektService;

    public ProjektController(ProjektService projektService) {
        this.projektService = projektService;
    }

    @PostMapping
    public void createProject(@RequestBody ProjektDto projektDto){
        projektDto.validate();
        projektService.createProject(projektDto);
    }

    @GetMapping
    public List<Projekt> getProjekt(){
        return projektService.getAllProjects();
    }

}

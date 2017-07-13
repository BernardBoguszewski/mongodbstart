package com.example.demo.factories;

import com.example.demo.domain.Projekt;
import com.example.demo.dtos.ProjektDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Britenet on 2017-07-13.
 */
@Component
public class ProjectFactory {
    public Projekt create(ProjektDto projektDto) {
        LocalDate startDate = LocalDate.parse(projektDto.getDataUtworzenia());
        LocalDate endDate = LocalDate.parse(projektDto.getDataZamkniecia());
        return new Projekt(projektDto.getNazwa(), projektDto.getOpis(), startDate, endDate);
    }
}

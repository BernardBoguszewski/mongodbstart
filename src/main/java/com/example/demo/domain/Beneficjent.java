package com.example.demo.domain;

import com.example.demo.enums.RodzajBeneficjenta;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Britenet on 2017-07-13.
 */
public class Beneficjent extends Contact {


    private Date birthDate;
    private Boolean disabled;
    private LocalDate dataWystawieniaZaswiadczenia;
    private LocalDate dataWaznosciZaswiadczenia;
    private  Notatka notatka;
    private RodzajBeneficjenta rodzajBeneficjenta;

    public Beneficjent(Date birthDate, Boolean disabled, LocalDate dataWystawieniaZaswiadczenia, LocalDate dataWaznosciZaswiadczenia, Notatka notatka) {
        this.birthDate = birthDate;
        this.disabled = disabled;
        this.dataWystawieniaZaswiadczenia = dataWystawieniaZaswiadczenia;
        this.dataWaznosciZaswiadczenia = dataWaznosciZaswiadczenia;
        this.notatka = notatka;
    }


    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public LocalDate getDataWystawieniaZaswiadczenia() {
        return dataWystawieniaZaswiadczenia;
    }

    public void setDataWystawieniaZaswiadczenia(LocalDate dataWystawieniaZaswiadczenia) {
        this.dataWystawieniaZaswiadczenia = dataWystawieniaZaswiadczenia;
    }

    public LocalDate getDataWaznosciZaswiadczenia() {
        return dataWaznosciZaswiadczenia;
    }

    public void setDataWaznosciZaswiadczenia(LocalDate dataWaznosciZaswiadczenia) {
        this.dataWaznosciZaswiadczenia = dataWaznosciZaswiadczenia;
    }

    public Notatka getNotatka() {
        return notatka;
    }

    public void setNotatka(Notatka notatka) {
        this.notatka = notatka;
    }
}

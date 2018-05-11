package com.labib.railtransportation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column(name = "date_of_birth")
    private int dateOfBirth;

    public Passenger(){}

    public Passenger(String name, String surname, int dateOfBirth){
        this.name =name;
        this.surname = surname;
        this.dateOfBirth =dateOfBirth;



    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

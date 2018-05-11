package com.labib.railtransportation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Station {

    @Id
    @GeneratedValue
    private int id;


    @Column
    private int trainNumber;

    public Station(){}


    public Station(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

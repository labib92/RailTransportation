package com.labib.railtransportation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Schedule {

    @Id
    @GeneratedValue
    private  int id;

    @Column
    private int trainNumber;


    @Column
    private int time;


    public Schedule(){}

    public Schedule(int trainNumber, int time) {
        this.trainNumber = trainNumber;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

package com.labib.railtransportation.model;

import javax.persistence.*;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

import java.util.Date;

@Embeddable
public class Schedule {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private int trainNumber;
    @Column
    private Date time;

    public Schedule(){}

    public Schedule(int trainNumber, Date time) {
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public String timeFormat() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(time);
    }
}

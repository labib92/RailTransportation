package com.labib.railtransportation.model;

import sun.plugin.javascript.navig.LinkArray;

import javax.persistence.*;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

import java.util.Date;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private Date time;


    @ManyToOne
    private Station station;

    @ManyToMany
    @Column(name = "train number_FK")
    private List<Train> trainNumber;

    public Schedule(){}

    public Schedule(Station station, List<Train> trainNumber, Date time) {
        this.time = time;
        this.station = station;
        this.trainNumber = trainNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public List<Train> getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(List<Train> trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String timeFormat() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(time);
    }
}

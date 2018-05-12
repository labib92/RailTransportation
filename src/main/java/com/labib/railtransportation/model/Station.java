package com.labib.railtransportation.model;

import javax.persistence.*;

@Entity
public class Station {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name_of_station")
    private String nameOfStation;

    private Schedule schedule;

    @Embedded
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Station(){}

    public Station(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }

    public String getNameOfStation() {
        return nameOfStation;
    }

    public void setNameOfStation(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

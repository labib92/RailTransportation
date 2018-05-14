package com.labib.railtransportation.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Station {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name_of_station")
    private String nameOfStation;

    @OneToMany
    private List<Schedule> schedules;


    public Station() {
    }

    public Station(String nameOfStation, List<Schedule> schedules) {
        this.nameOfStation = nameOfStation;
        this.schedules = schedules;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }


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

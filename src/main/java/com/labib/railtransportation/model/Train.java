package com.labib.railtransportation.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Train {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String trainNumber;

    @Column(name = "follow_up_station")
    private String route;

    @Column(name = "number_of_seats")
    private int numberOfSeats;

    @ManyToMany
    private List<Schedule> schedule;

    public Train(){}

    public Train(String route, int numberOfSeats, List<Schedule> schedule, String trainNumber) {
        this.route = route;
        this.numberOfSeats = numberOfSeats;
        this.schedule = schedule;
        this.trainNumber = trainNumber;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
}

package com.labib.railtransportation.model;

import javax.persistence.*;

@Embeddable
public class Train {

    @Id
    @GeneratedValue
    @Column(name = "train_number_PK")
    private int id;

    @Column(name = "follow_up_station")
    private String route;

    @Column(name = "number_of_seats")
    private int numberOfSeats;

    public Train(){}

    public Train(String route, int numberOfSeats) {
        this.route = route;
        this.numberOfSeats = numberOfSeats;
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
}

package com.labib.railtransportation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Train {

    @Id
    @GeneratedValue
    @Column(name = "train_number")
    private int trainNumber;

    @Column(name = "station_name")
    private String stationName;

    @Column(name = "number_of_seats")
    private int numberOfSeats;

    public Train(){}

    public Train( String stationName, int numberOfSeats) {
        this.stationName = stationName;
        this.numberOfSeats = numberOfSeats;
    }




    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

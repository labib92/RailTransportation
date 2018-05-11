package com.labib.railtransportation.model;


import javax.persistence.*;

@Entity
public class Ticket {


    @Id
    @GeneratedValue
    private int id;

    @Column
    private int trainNumber;

    @Column
    private String passanger;

    public Ticket(){}

    public Ticket(int trainNumber, String passanger) {
        this.trainNumber = trainNumber;
        this.passanger = passanger;
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


    public String getPassanger() {
        return passanger;
    }

    public void setPassanger(String passanger) {
        this.passanger = passanger;
    }
}

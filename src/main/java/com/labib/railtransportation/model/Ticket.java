package com.labib.railtransportation.model;


import javax.persistence.*;

@Entity
public class Ticket {


    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Train train;

    @ManyToOne
    private Passenger passenger;

    public Ticket() {
    }

    public Ticket(Train train, Passenger passenger) {
        this.train = train;
        this.passenger = passenger;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

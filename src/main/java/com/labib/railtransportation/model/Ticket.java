package com.labib.railtransportation.model;


import javax.persistence.*;

@Entity
public class Ticket {


    @Id
    @GeneratedValue
    private int id;

    private Train train;

    private Passenger passenger;


    @Embedded
    @JoinColumn(name = "train_FK")
    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Embedded
    @JoinColumn(name = "passenger_FK")
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

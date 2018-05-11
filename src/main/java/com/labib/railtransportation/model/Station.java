package com.labib.railtransportation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Station {

    @Id
    @GeneratedValue
    private int id;

    public Station(){}



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

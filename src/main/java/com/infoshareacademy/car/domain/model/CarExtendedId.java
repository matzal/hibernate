package com.infoshareacademy.car.domain.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CarExtendedId implements Serializable {

    public CarExtendedId() {
    }

    public CarExtendedId(String registration, String owner) {
        this.registration = registration;
        this.owner = owner;
    }

    private String registration;

    private String owner;

    @Override
    public String toString() {
        return "CarExtendedId{" +
                "registration='" + registration + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
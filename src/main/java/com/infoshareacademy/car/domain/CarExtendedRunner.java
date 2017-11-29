package com.infoshareacademy.car.domain;

import com.infoshareacademy.car.domain.model.CarExtended;
import com.infoshareacademy.car.domain.model.CarExtendedId;
import com.infoshareacademy.car.domain.model.Color;
import com.infoshareacademy.hibernate.SessionFactoryProvider;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class CarExtendedRunner {

    public static final String REGISTRATION = "NOL1237";
    public static final String OWNER = "Pan Tadeusz";

    private void saveCar() {
        CarExtended car = new CarExtended();
        CarExtendedId id = new CarExtendedId(REGISTRATION, OWNER);
        car.setId(id);
        car.setModel("Volkswagen CC");
        car.setColor(Color.BLACK);
        car.setProductionYear(Timestamp.valueOf(LocalDateTime
                .of(2012, 12, 11, 10, 55)));
        new CarExtendedRepository().saveCar(car);
    }

    private CarExtended findCar() {
        return new CarExtendedRepository().findCarById(new CarExtendedId(REGISTRATION, OWNER));
    }

    public static void main(String[] args) {
        CarExtendedRunner carRunner = new CarExtendedRunner();
        carRunner.saveCar();

        CarExtended car = carRunner.findCar();
        System.out.println(car.toString());

        SessionFactoryProvider.getSessionFactory().close();
    }

}

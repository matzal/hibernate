package com.infoshareacademy.car.domain;

import com.infoshareacademy.car.domain.model.Car;
import com.infoshareacademy.hibernate.SessionFactoryProvider;

public class CarRunner {

    private void saveCar() {
        Car car = new Car();
        car.setModel("Volkswagen CC");
        new CarRepository().saveCar(car);
    }

    private Car findCar() {
        return new CarRepository().findCarById(1l);
    }

    public static void main(String[] args) {
       CarRunner carRunner = new CarRunner();
       carRunner.saveCar();

       Car car = carRunner.findCar();
       System.out.println(car.toString());

       SessionFactoryProvider.getSessionFactory().close();
    }

}

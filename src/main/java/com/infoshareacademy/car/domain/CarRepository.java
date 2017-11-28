package com.infoshareacademy.car.domain;

import com.infoshareacademy.car.domain.model.Car;
import com.infoshareacademy.hibernate.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarRepository {

//    public Car findCarByModel() {
//
//    }

    public Car findCarById(long id) {
        Session session= SessionFactoryProvider.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Car car = (Car) session.get(Car.class, id);
        tx.commit();
        return car;
    }

    public void saveCar(Car car) {
        Session session= SessionFactoryProvider.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(car);
        tx.commit();
    }

}

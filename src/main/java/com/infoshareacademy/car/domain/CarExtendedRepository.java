package com.infoshareacademy.car.domain;

import com.infoshareacademy.car.domain.model.CarExtended;
import com.infoshareacademy.car.domain.model.CarExtendedId;
import com.infoshareacademy.hibernate.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarExtendedRepository {

    public CarExtended findCarById(CarExtendedId id) {
        Session session= SessionFactoryProvider.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        CarExtended car = (CarExtended) session.get(CarExtended.class, id);
        tx.commit();
        return car;
    }

    public void saveCar(CarExtended car) {
        Session session= SessionFactoryProvider.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(car);
        tx.commit();
    }
}
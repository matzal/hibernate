package com.infoshareacademy.car.domain.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class CarExtended {

    @EmbeddedId
    private CarExtendedId id;

    private String model;

    //ordinal for numbers, string for strings
    @Enumerated(EnumType.STRING)
    private Color color;

    @Column(name = "PRODUCTION_YEAR")
    private Timestamp productionYear;

    public CarExtendedId getId() {
        return id;
    }

    public void setId(CarExtendedId id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Timestamp getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Timestamp productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "CarExtended{" +
                "id=" + id.toString() +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", productionYear=" + productionYear +
                '}';
    }
}
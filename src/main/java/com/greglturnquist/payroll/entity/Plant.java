package com.greglturnquist.payroll.entity;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity 
@Data
@RequiredArgsConstructor
public class Plant {
    private @Id @GeneratedValue Long id;
    private final String name;
    private final String category;
    private final Float price;
    private final String sunlightLevel;
    private final String fertilizing;
    private final String watering;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(id, plant.id) && 
            Objects.equals(category, plant.category) &&
            Objects.equals(name, plant.name) &&
            Objects.equals(price, plant.price) &&
            Objects.equals(sunlightLevel, plant.sunlightLevel) &&
            Objects.equals(fertilizing, plant.fertilizing) &&
            Objects.equals(watering, plant.watering) ;
            // &&   Objects.equals(rating, plant.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, price, sunlightLevel, fertilizing, watering);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
}


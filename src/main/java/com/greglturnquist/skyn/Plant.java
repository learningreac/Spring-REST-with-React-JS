package com.greglturnquist.skyn;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Plant {
    private @Id @GeneratedValue Long id;
    private String name;
    private Double price;
    private String sunlightLevel;
    private String fertilizing;
    private String watering;
    private Double rating;

    private Plant() {};

    public Plant(String name, Double price, String sunlightLevel, 
                    String fertilizing, String watering, Double rating) {
        this.name = name;
        this.price = price;
        this.sunlightLevel = sunlightLevel;
        this.fertilizing = fertilizing;
        this.watering = watering;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(id, plant.id) && 
            Objects.equals(name, plant.name) &&
            Objects.equals(price, plant.price) &&
            Objects.equals(sunlightLevel, plant.sunlightLevel) &&
            Objects.equals(fertilizing, plant.fertilizing) &&
            Objects.equals(watering, plant.watering) &&
            Objects.equals(rating, plant.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, sunlightLevel, fertilizing, watering, rating);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSunlightLevel() {
        return sunlightLevel;
    }

    public void setSunlightLevel(String sunlightLevel) {
        this.sunlightLevel = sunlightLevel;
    }

    public String getFertilizing() {
        return sunlightLevel;
    }

    public void setFertilizing(String fertilizing) {
        this.fertilizing = fertilizing;
    }

    public String getWatering() {
        return watering;
    }

    public void setWatering(String watering) {
        this.watering = watering;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}


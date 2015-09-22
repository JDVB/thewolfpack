package com.realdolmen.wolfpack.entities;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by JDOAX80 on 22/09/2015.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = Beer.FIND_ALL, query = "SELECT b FROM Beer b"),
        @NamedQuery(name = Beer.FIND_BEER_BY_ID, query = "SELECT b FROM Beer b WHERE id = :id")
})
public class Beer {

    public static final String FIND_ALL = "findAllBeers";
    public static final String FIND_BEER_BY_ID = "findBeerById";
    @Id
    @GeneratedValue()
    private Integer id;
    private String type;
    private String producer;
    private String brand;
    private double volume;
    private int unitsSold;
    private double alcoholPercentage;
    private double totalVolume;
    private int count;
    private String imageSource;

    public Beer(String type, String producer, String brand, double volume, double alcoholPercentage) {
        this.type = type;
        this.producer = producer;
        this.brand = brand;
        this.volume = volume;
        this.alcoholPercentage = alcoholPercentage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Beer beer = (Beer) o;

        if (!type.equals(beer.type)) return false;
        return brand.equals(beer.brand);

    }

    @Override
    public int hashCode() {
        return 0;
    }
}

package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    public void delete(City city) {
        for (City c : cities) {
            if (c.getCityName().equals(city.getCityName()) && (c.getProvinceName().equals(city.getProvinceName()))) {
                cities.remove(c);
            }
        }
    }

}

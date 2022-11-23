package com.spring.services.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String lastName;
    private List<Car> cars = new ArrayList<>();

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCars(List<Car> cars) {
        this.cars.addAll(cars);
    }

    public List<Car> getCars() {
        return cars;
    }
}

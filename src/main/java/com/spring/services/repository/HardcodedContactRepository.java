package com.spring.services.repository;

import com.spring.services.model.Car;
import com.spring.services.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class HardcodedContactRepository {

    public List<Person> getContacts() {
        Car car1 = new Car("Zyguli");
        Car car2 = new Car("Citroen");
        Car car3 = new Car("Volvo");
        Car car4 = new Car("Honda");

        List<Person> contacts = new ArrayList<>();
        Person person1 = new Person("Petrov");
        person1.setCars(Arrays.asList(car1));
        Person person2 = new Person("Ivanov");
        person2.setCars(Arrays.asList(car2));
        Person person3 = new Person("Sidorov");
        person3.setCars(Arrays.asList(car3, car4));
        contacts.addAll(Arrays.asList(person1, person2, person3));
        return contacts;
    }
}

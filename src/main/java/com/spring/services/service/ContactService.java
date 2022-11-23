package com.spring.services.service;

import com.spring.services.model.Person;

import java.util.List;

public interface ContactService {

    List<Person> getAllContacts();
    Person getContactByName(String lastName);
}

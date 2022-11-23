package com.spring.services.service;

import com.spring.services.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import com.spring.services.repository.HardcodedContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private HardcodedContactRepository repository;

    public List<Person> getAllContacts() {
        return repository.getContacts();
    }

    public Person getContactByName(String lastName) {
        return getAllContacts().stream().filter(v -> v.getLastName().equals(lastName)).findFirst().get();
    }
}

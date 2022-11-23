package com.spring.services.web;

import com.spring.services.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.services.service.ContactService;

import java.util.List;

@RestController
@RequestMapping(value = ContactController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class ContactController {

    public static final String REST_URL = "/rest";

    @Autowired
    private ContactService service;

    @GetMapping("/contacts")
    public ResponseEntity<List<Person>> getAllContacts() {
        List<Person> contacts = service.getAllContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping("/contacts/{lastName}")
    public ResponseEntity<Person> getContactByName(@PathVariable("lastName")String lastName) {
        Person contact = service.getContactByName(lastName);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
}

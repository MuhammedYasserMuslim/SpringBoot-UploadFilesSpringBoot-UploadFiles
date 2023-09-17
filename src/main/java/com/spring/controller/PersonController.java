
package com.spring.controller;

import com.spring.model.Person;
import com.spring.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonServices personServices;


    @GetMapping("/count")
    public long count() {
        return personServices.count();
    }

    @GetMapping("/persons")
    public List<Person> findAll() {
        return personServices.findAll();
    }

    @GetMapping("/person")
    public Optional<Person> findById(@RequestParam Long id) {
        return personServices.findById(id);
    }

    @PostMapping("/persons")
    public Person save(@RequestBody Person person) {
        personServices.save(person);
        return person;
    }

    @PutMapping("/persons")
    public Person update(@RequestBody Person person) {
        personServices.save(person);
        return person;
    }

    @DeleteMapping("/person")
    public Person deleteById(@RequestParam Long id) {
        Person person;
        person = personServices.findById(id).get();
        personServices.deleteById(id);
        return person;
    }
}
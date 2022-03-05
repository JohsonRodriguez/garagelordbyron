package com.example.demo.service;

import com.example.demo.entity.Car;
import com.example.demo.entity.Person;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.Optional;


public interface PersonService {
    Iterable<Person> listarPerson();
    void addCarToPerson(String dni, String registrationplate);
    void removeCarToPerson(String dni, String registrationplate);

    ResponseEntity<?> changeUserStatus (String dni, boolean isEnabled);
    Person newPerson(Person person);
    Collection<Car> searchCars(String person_id);
     void updatePerson(Person person);
     Long countPerson();

    Optional<Person> searchPerson(String dni);





}

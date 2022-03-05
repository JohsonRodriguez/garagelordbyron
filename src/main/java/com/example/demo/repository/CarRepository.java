package com.example.demo.repository;

import com.example.demo.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CarRepository extends CrudRepository<Car,String> {
    Car findByregistrationplate(String plate);
}

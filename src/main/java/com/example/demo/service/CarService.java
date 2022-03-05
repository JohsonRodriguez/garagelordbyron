package com.example.demo.service;

import com.example.demo.entity.Car;


public interface CarService {
    Iterable<Car> listCar();
    void newCar(Car car);
    void updateCar(Car car);
    Long countCar();
    Car searchCar(String plate);
}

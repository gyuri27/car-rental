package com.example.car.rental.service;

import java.util.List;
import java.util.Optional;

import com.example.car.rental.data.model.Car;

/**
 * A service for managing cars in the car catalog.
 */
public interface CarService {

Car createCar_rental(Car car);

Optional<Car> retrieveCarById(Long id);

List<Car> retrieveAllCars();

Car updateCar(Car car);

void deleteCarById(Long id);
}

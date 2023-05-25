package com.example.car.rental.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.car.rental.data.model.Car;
import com.example.car.rental.service.CarService;
import com.example.car.rental.data.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Default implementation of the CarService interface.
 * This class provides methods to create, retrieve, update, and delete Car objects.
 */
@Service
public class DefaultCarService implements CarService {

private final Repo<Car, Long> repository;

/**
 * Constructs a DefaultCarService with the specified repository.
 *
 * @param repository the repository used to interact with Car objects
 */
@Autowired
public DefaultCarService(Repo<Car, Long> repository) {
    this.repository = repository;
}

/**
 * Creates a new car rental by saving the Car object to the repository.
 *
 * @param car the Car object to be created
 * @return the created Car object
 */
@Override
public Car createCar_rental(Car car) {
    return repository.save(car);
}

/**
 * Retrieves a car rental by its ID from the repository.
 *
 * @param id the ID of the car rental to retrieve
 * @return an Optional containing the retrieved Car object, or an empty Optional if not found
 */
@Override
public Optional<Car> retrieveCarById(Long id) {
    return repository.getById(id);
}

/**
 * Retrieves all car rentals from the repository.
 *
 * @return a List containing all the Car objects
 */
@Override
public List<Car> retrieveAllCars() {
    return repository.getAll();
}

/**
 * Deletes a car rental by its ID from the repository.
 *
 * @param id the ID of the car rental to delete
 */
@Override
public void deleteCarById(Long id) {
    repository.deleteById(id);
}

/**
 * Updates a car rental by saving the updated Car object to the repository.
 *
 * @param car the updated Car object
 * @return the updated Car object
 */
@Override
public Car updateCar(Car car) {
    return repository.update(car);
}
}

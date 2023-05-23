package com.example.car.rental.service;

import java.util.List;
import java.util.Optional;

import com.example.car.rental.data.model.Car;


/**
 * Service interface for managing car rentals.
 * This interface defines methods for creating, retrieving, updating, and deleting car rentals.
 */
public interface CarService {

/**
 * Creates a new car rental.
 *
 * @param car the Car object representing the car rental to be created
 * @return the created Car object
 */
Car createCar_rental(Car car);

/**
 * Retrieves a car rental by its ID.
 *
 * @param id the ID of the car rental to retrieve
 * @return an Optional containing the retrieved Car object, or an empty Optional if not found
 */
Optional<Car> retrieveCarById(Long id);

/**
 * Retrieves all car rentals.
 *
 * @return a List containing all the Car objects
 */
List<Car> retrieveAllCars();

/**
 * Updates a car rental.
 *
 * @param car the updated Car object
 * @return the updated Car object
 */
Car updateCar(Car car);

/**
 * Deletes a car rental by its ID.
 *
 * @param id the ID of the car rental to delete
 */
void deleteCarById(Long id);
}

package com.example.car.rental.data.repo.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Map;

import com.example.car.rental.data.repo.Repo;
import com.example.car.rental.data.model.Car;
import org.springframework.stereotype.Repository;

/**
 * Implementation of the Repo interface for managing Car objects.
 * This class provides methods to save, retrieve, update, and delete Car objects from a storage.
 */
@Repository
public class CarRepo implements Repo<Car, Long> {

/**
 * The storage map for Car objects.
 * Maps the ID of the Car to the Car object itself.
 */
public static final Map<Long, Car> Storage = new HashMap<>();

/**
 * Saves a Car object to the storage.
 *
 * @param item the Car object to be saved
 * @return the saved Car object
 */
@Override
public Car save(Car item) {
	System.out.println(item);
	Long id = Storage.size() + 1L;
	item.setID(id);
	Storage.put(id, item);
	return Storage.get(id);
}


/**
 * Updates a Car object in the storage.
 *
 * @param item the Car object to be updated
 * @return the updated Car object
 */
@Override
public Car update(Car item) {
	System.out.println(item);
	Long id = item.getID();
	Storage.put(id, item);
	return Storage.get(id);
}
/**
 * Retrieves all Car objects from the storage.
 *
 * @return a List containing all the Car objects
 */
@Override
public List<Car> getAll() {
	return Storage.values().stream().toList();
}

/**
 * Retrieves a Car object by its ID from the storage.
 *
 * @param id the ID of the Car object to retrieve
 * @return an Optional containing the retrieved Car object, or an empty Optional if not found
 */
@Override
public Optional<Car> getById(Long id) {
	return Optional.ofNullable(Storage.get(id));
}

/**
 * Deletes a Car object by its ID from the storage.
 *
 * @param id the ID of the Car object to delete
 */
@Override
public void deleteById(Long id) {
	Storage.remove(id);
}
}

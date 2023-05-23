package com.example.car.rental.data.repo;

import java.util.List;
import java.util.Optional;

/**
 * A generic repository interface for managing objects of type T.
 *
 * @param <T> the type of the objects in the repository
 * @param <I> the type of the ID or key used to identify the objects
 */
public interface Repo<T, I> {

/**
 * Saves an object to the repository.
 *
 * @param item the object to be saved
 * @return the saved object
 */
T save(T item);

/**
 * Retrieves an object by its ID from the repository.
 *
 * @param id the ID of the object to retrieve
 * @return an Optional containing the retrieved object, or an empty Optional if not found
 */
Optional<T> getById(I id);

/**
 * Retrieves all objects from the repository.
 *
 * @return a List containing all the objects
 */
List<T> getAll();

/**
 * Updates an object in the repository.
 *
 * @param item the object to be updated
 * @return the updated object
 */
T update(T item);

/**
 * Deletes an object by its ID from the repository.
 *
 * @param id the ID of the object to delete
 */
void deleteById(I id);
}

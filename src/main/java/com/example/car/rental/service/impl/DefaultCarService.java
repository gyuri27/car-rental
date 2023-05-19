package com.example.car.rental.service.impl;

import java.util.List;
import java.util.Optional;

import com.example.car.rental.data.model.Car;
import com.example.car.rental.service.CarService;
import com.example.car.rental.data.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultCarService implements CarService {

    private final Repo<Car, Long> repository;

    @Autowired
    public DefaultCarService(Repo<Car, Long> repository) {
        this.repository = repository;
    }

    @Override
    public Car createCar_rental(Car car) {
        return repository.save(car);
    }

    @Override
    public Optional<Car> retrieveCarById(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Car> retrieveAllSongs() {
        return repository.getAll();
    }

    @Override
    public Car updateSong(Car car) {
        return repository.update(car);
    }

    @Override
    public void deleteSongById(Long id) {
        repository.deleteById(id);
    }
}

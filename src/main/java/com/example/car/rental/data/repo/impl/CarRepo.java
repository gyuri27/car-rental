package com.example.car.rental.data.repo.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.car.rental.data.model.Car;
import com.example.car.rental.data.repo.Repo;
@org.springframework.stereotype.Repository
public class CarRepo implements Repo<Car, Long> {

    public static final Map<Long, Car> Storage = new HashMap<>();
    @Override
    public Car save(Car item) {
        System.out.println(item);
        Long id = Storage.size() + 1L;
        item.setID(id);
        Storage.put(id, item);
        return Storage.get(id);
    }

    @Override
    public Optional<Car> getById(Long id) {
        return Optional.ofNullable(Storage.get(id));
    }

    @Override
    public List<Car> getAll() {
        return Storage.values().stream().toList();
    }

    @Override
    public Car update(Car item) {
        System.out.println(item);
        Long id = item.getID();
        Storage.put(id, item);
        return Storage.get(id);
    }

    @Override
    public void deleteById(Long id) {
        Storage.remove(id);
    }
}

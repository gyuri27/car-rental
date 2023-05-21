package com.example.car.rental.web.controller;

import java.util.List;
import java.util.Optional;

import com.example.car.rental.data.model.Car;
import com.example.car.rental.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/car-rental")
@Log4j2
public class CarRestController {

    private final CarService carService;


    @GetMapping("/{ID}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Optional<Car> car = carService.retrieveCarById(id);
        return car.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.retrieveAllCars();
    }

    @PostMapping
    public Car createSong(@RequestBody Car car) {
        return carService.createCar_rental(car);
    }

    @PutMapping
    public Car updateSong(@RequestBody Car car) {
        return carService.updateCar(car);
    }

    @DeleteMapping("/{id}")
    public void deleteSongById(@PathVariable Long id) {
        carService.deleteCarById(id);
    }
}

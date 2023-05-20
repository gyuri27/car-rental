package com.example.car.rental.web.controller;

import java.util.List;
import java.util.Optional;

import com.example.car.rental.data.model.Car;
import com.example.car.rental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car-rental")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{id}")
    public String getCarByid(Model model, @PathVariable Long id) {
        Optional<Car> optionalCar = carService.retrieveCarById(id);
        return optionalCar.map
                (
                        car -> {
                            model.addAttribute("car",car);
                            return "car-rental/edit";
                        }
                ).orElseGet(
                () -> {
                    model.addAttribute("requestUri", "car-rental/" + id);
                    return "car-rental/notFound";
                }
        );
    }

    @GetMapping
    public String getAllCar(Model model) {
        List<Car> allCar = carService.retrieveAllCars();
        model.addAttribute("car",allCar);
        return "car-rental/list";
    }

    @GetMapping("/create")
    public String createCar() {
        return "car-rental/create";
    }

    @PostMapping("/create")
    public String createCar(Model model, Car car)
    {
        Car newCar = carService.createCar_rental(car);
        model.addAttribute("car",newCar);
        return "car-rental/edit";
    }

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String updateSong(Model model, Car car) {
        Car updatedCar = carService.updateCar(car);
        model.addAttribute("song", updatedCar);
        return "car-rental/edit";
    }

    @GetMapping("/{id}/delete")
    public String deleteSongById(Model model, @PathVariable Long id) {
        carService.deleteCarById(id);
        List<Car> allCars = carService.retrieveAllCars();
        model.addAttribute("songs", allCars);
        return "music-catalog/list";
    }
}

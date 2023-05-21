package com.example.car.rental.web.controller;

import java.util.List;
import java.util.Optional;

import com.example.car.rental.data.model.Car;
import com.example.car.rental.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/car-rental")
@Slf4j
public class CarController {

    private final CarService carService;

    @GetMapping("/{ID}")
    public String getCarByid(Model model, @PathVariable Long ID) {
        Optional<Car> optionalCar = carService.retrieveCarById(ID);
        return optionalCar.map
                (
                        car -> {
                            model.addAttribute("car",car);
                            return "edit";
                        }
                ).orElseGet(
                () -> {
                    model.addAttribute("requestUri", "car-rental/" + ID);
                    return "notFound";
                }
        );
    }

    @GetMapping
    public String getAllCar(Model model) {
        List<Car> allCar = carService.retrieveAllCars();
        model.addAttribute("cars",allCar);
        return "list";
    }

    @GetMapping("/create")
    public String createCar() {
        return "create";
    }

    @PostMapping("/create")
    public String createCar(Model model, Car car)
    {
        Car newCar = carService.createCar_rental(car);
        model.addAttribute("car",newCar);
        return "edit";
    }

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String updateCar(Model model, Car car) {
        Car updatedCar = carService.updateCar(car);
        model.addAttribute("car", updatedCar);
        return "edit";
    }

    @GetMapping("/{ID}/delete")
    public String deleteCarById(Model model, @PathVariable Long ID) {
        carService.deleteCarById(ID);
        List<Car> allCars = carService.retrieveAllCars();
        model.addAttribute("cars", allCars);
        return "list";
    }
}

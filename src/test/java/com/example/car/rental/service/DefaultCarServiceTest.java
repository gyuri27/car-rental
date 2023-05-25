package com.example.car.rental.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.awt.*;
import java.util.List;
import java.util.Optional;

import com.example.car.rental.data.model.Car;
import com.example.car.rental.data.model.car_body_type;
import com.example.car.rental.data.model.fuel_type;
import com.example.car.rental.data.model.gearbox_type;
import com.example.car.rental.data.repo.Repo;
import com.example.car.rental.service.impl.DefaultCarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class DefaultCarServiceTest {

private static final Long Car_ID = 1L;

private static final Car car = new Car(Car_ID, "car_name", car_body_type.Cabrio,4L,5L, gearbox_type.Manual,2L, fuel_type.Petrol,"Nem");

@Mock
private Repo<Car, Long> carLongRepo;

private CarService carService;


@Test
void createCars()
{
    given(carLongRepo.save(car)).willReturn(car);
    
    final Car actual = carService.createCar_rental(car);
    
    assertThat(actual, equalTo(car));
    verify(carLongRepo).save(car);
    verifyNoMoreInteractions(carLongRepo);
}
@BeforeEach
void serUp(){
    MockitoAnnotations.openMocks(this);
    carService = new DefaultCarService(carLongRepo);
}
@Test
void CarByID()
{
    given(carLongRepo.getById(Car_ID)).willReturn(Optional.of(car));
    
    final Optional<Car> actual = carService.retrieveCarById(Car_ID);
    
    assertThat(actual, equalTo(Optional.of(car)));
    verify(carLongRepo).getById(Car_ID);
    verifyNoMoreInteractions(carLongRepo);
}

@Test
void updateCar()
{
    given(carLongRepo.update(car)).willReturn(car);
    
    final Car actual = carService.updateCar(car);
    
    assertThat(actual, equalTo(car));
    verify(carLongRepo).update(car);
    verifyNoMoreInteractions(carLongRepo);
}

@Test
void Allcar()
{
    given(carLongRepo.getAll()).willReturn(List.of(car));
    
    final List<Car> actual = carService.retrieveAllCars();
    
    assertThat(actual, equalTo(List.of(car)));
    verify(carLongRepo).getAll();
    verifyNoMoreInteractions(carLongRepo);
}
}

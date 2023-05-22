package com.example.car.rental.data.model;

import java.util.Objects;

public class Car {

private Long ID;
private String car_name;
private car_body_type car_body;
private Long person;
private Long door;
private gearbox_type gearbox;
private Long bag;
private fuel_type fuel;
private String rental_status;

public Car() {
}

public Car(Long ID, String car_name, car_body_type car_body, Long person, Long door, gearbox_type gearbox, Long bag, fuel_type fuel, String rental_status) {
	this.ID = ID;
	this.car_name = car_name;
	this.car_body = car_body;
	this.person = person;
	this.door = door;
	this.gearbox = gearbox;
	this.bag = bag;
	this.fuel = fuel;
	this.rental_status = rental_status;
}

public Long getID() {
	return ID;
}

public void setID(Long ID) {
	this.ID = ID;
}

public String getCar_name() {
	return car_name;
}

public void setCar_name(String car_name) {
	this.car_name = car_name;
}

public car_body_type getCar_body() {
	return car_body;
}

public void setCar_body(car_body_type car_body) {
	this.car_body = car_body;
}

public Long getPerson() {
	return person;
}

public void setPerson(Long person) {
	this.person = person;
}

public Long getDoor() {
	return door;
}

public void setDoor(Long door) {
	this.door = door;
}

public gearbox_type getGearbox() {
	return gearbox;
}

public void setGearbox(gearbox_type gearbox) {
	this.gearbox = gearbox;
}

public Long getBag() {
	return bag;
}

public void setBag(Long bag) {
	this.bag = bag;
}

public fuel_type getFuel() {
	return fuel;
}

public void setFuel(fuel_type fuel) {
	this.fuel = fuel;
}

public String getRental_status() {
	return rental_status;
}

public void setRental_status(String rental_status) {
	this.rental_status = rental_status;
}

@Override
public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	Car car = (Car) o;
	
	if (!Objects.equals(ID, car.ID)) {
		return false;
	}
	if (!Objects.equals(car_name, car.car_name)) {
		return false;
	}
	
	if (!Objects.equals(person, car.person)) {
		return false;
	}
	
	if (!Objects.equals(door, car.door)) {
		return false;
	}
	
	if (!Objects.equals(bag, car.bag)) {
		return false;
	}
	
	if (!Objects.equals(rental_status, car.rental_status)) {
		return false;
	}
	
	return car_body == car.car_body && gearbox == car.gearbox && fuel == car.fuel;
	
}

@Override
public int hashCode() {
	int result = ID != null ? ID.hashCode() : 0;
	result = 31 * result + (car_name != null ? car_name.hashCode() : 0);
	result = 31 * result + (car_body != null ? car_body.hashCode() : 0);
	result = 31 * result + (gearbox != null ? gearbox.hashCode() : 0);
	result = 31 * result + (fuel != null ? fuel.hashCode() : 0);
	result = 31 * result + (person != null ? person.hashCode() : 0);
	result = 31 * result + (door != null ? door.hashCode() : 0);
	result = 31 * result + (bag != null ? bag.hashCode() : 0);
	result = 31 * result + (rental_status != null ? rental_status.hashCode() : 0);
	return result;
}

@Override
public String toString() {
	return "Car{" +
		"ID=" + ID +
		", car_name='" + car_name + '\'' +
		", car_body=" + car_body +
		", person=" + person +
		", door=" + door +
		", gearbox=" + gearbox +
		", bag=" + bag +
		", fuel=" + fuel +
		", rental_status=" + rental_status +
		'}';
}
}

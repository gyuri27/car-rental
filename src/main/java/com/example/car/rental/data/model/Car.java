package com.example.car.rental.data.model;

import java.util.Objects;


/**
 * A class representing a Car.
 */
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

/**
 * Default constructor for the Car class.
 */
public Car() {
}

/**
 * Parameterized constructor for the Car class.
 *
 * @param ID             the ID of the car
 * @param car_name       the name of the car
 * @param car_body       the body type of the car
 * @param person         the number of persons the car can accommodate
 * @param door           the number of doors the car has
 * @param gearbox        the type of gearbox of the car
 * @param bag            the capacity of the car's trunk in liters
 * @param fuel           the type of fuel used by the car
 * @param rental_status  the rental status of the car
 */
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

/**
 * Returns the ID of the car.
 *
 * @return the ID of the car
 */
public Long getID() {
	return ID;
}

/**
 * Sets the ID of the car.
 *
 * @param ID the ID of the car
 */
public void setID(Long ID) {
	this.ID = ID;
}

/**
 * Returns the name of the car.
 *
 * @return the name of the car
 */
public String getCar_name() {
	return car_name;
}

/**
 * Sets the name of the car.
 *
 * @param car_name the name of the car
 */
public void setCar_name(String car_name) {
	this.car_name = car_name;
}

/**
 * Returns the body type of the car.
 *
 * @return the body type of the car
 */
public car_body_type getCar_body() {
	return car_body;
}

/**
 * Sets the body type of the car.
 *
 * @param car_body the body type of the car
 */
public void setCar_body(car_body_type car_body) {
	this.car_body = car_body;
}

/**
 * Returns the number of persons the car can accommodate.
 *
 * @return the number of persons the car can accommodate
 */
public Long getPerson() {
	return person;
}

/**
 * Sets the number of persons the car can accommodate.
 *
 * @param person the number of persons the car can accommodate
 */
public void setPerson(Long person) {
	this.person = person;
}

/**
 * Returns the number of doors the car has.
 *
 * @return the number of doors the car has
 */
public Long getDoor() {
	return door;
}

/**
 * Sets the number of doors the car has.
 *
 * @param door the number of doors the car has
 */
public void setDoor(Long door) {
	this.door = door;
}

/**
 * Returns the type of gearbox of the car.
 *
 * @return the type of gearbox of the car
 */
public gearbox_type getGearbox() {
	return gearbox;
}

/**
 * Sets the type of gearbox of the car.
 *
 * @param gearbox the type of gearbox of the car
 */
public void setGearbox(gearbox_type gearbox) {
	this.gearbox = gearbox;
}

/**
 * Returns the capacity of the car's trunk in liters.
 *
 * @return the capacity of the car's trunk in liters
 */
public Long getBag() {
	return bag;
}

/**
 * Sets the capacity of the car's trunk in liters.
 *
 * @param bag the capacity of the car's trunk in liters
 */
public void setBag(Long bag) {
	this.bag = bag;
}

/**
 * Returns the type of fuel used by the car.
 *
 * @return the type of fuel used by the car
 */
public fuel_type getFuel() {
	return fuel;
}

/**
 * Sets the type of fuel used by the car.
 *
 * @param fuel the type of fuel used by the car
 */
public void setFuel(fuel_type fuel) {
	this.fuel = fuel;
}

/**
 * Returns the rental status of the car.
 *
 * @return the rental status of the car
 */
public String getRental_status() {
	return rental_status;
}

/**
 * Sets the rental status of the car.
 *
 * @param rental_status the rental status of the car
 */
public void setRental_status(String rental_status) {
	this.rental_status = rental_status;
}

/**
 * Checks if this car is equal to another object.
 *
 * @param o the object to compare to
 * @return true if the cars are equal, false otherwise
 */
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

/**
 * Returns the hash code of the car.
 *
 * @return the hash code of the car
 */
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

/**
 * Returns a string representation of the car.
 *
 * @return a string representation of the car
 */
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

package com.example.car.rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Elindítja a kocsi kölcssönzés web alkalmazást.
 */
@SpringBootApplication
public class CarRentalApplication {

/**
 * Main funtcion.
 *
 * @param args Egy string változó.
 */
public static void main(String[] args) {
	SpringApplication.run(CarRentalApplication.class, args);
}

}

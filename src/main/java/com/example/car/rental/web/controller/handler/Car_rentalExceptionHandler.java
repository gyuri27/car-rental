package com.example.car.rental.web.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * Exception handler for car rental-related exceptions.
 * This class handles exceptions thrown by the controllers and provides appropriate error responses.
 */
@Slf4j
@RestControllerAdvice
public class Car_rentalExceptionHandler extends ResponseEntityExceptionHandler {

/**
 * Handles general exceptions and returns an internal server error response.
 *
 * @param e the Exception object to handle
 * @return a message indicating a server-side error
 */
@ExceptionHandler(Exception.class)
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public String handleException(final Exception e) {
    log.error("Server side problem:", e);
    return "Szerver oldali hiba, kérem lépjen kapcsolatba az üzemeltetövel!";
}
}

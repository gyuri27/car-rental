package com.example.car.rental.web.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestControllerAdvice
public class Car_rentalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleException(final Exception e) {
        log.error("Server side problem:",e);
        return "Szerver oldali hiba, kérem lépjen kapcsolatba az üzemeltetövel!";
    }
}

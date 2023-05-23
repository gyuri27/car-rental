package com.example.car.rental.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for Spring WebMvc.
 * This class provides configuration for handling view controllers and resource handlers.
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

/**
 * Registers view controllers for specified paths.
 *
 * @param registry the ViewControllerRegistry used for registering view controllers
 */
@Override
public void addViewControllers(final ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("list");
    registry.addViewController("/list").setViewName("list");
}

/**
 * Configures resource handlers for serving static resources.
 *
 * @param registry the ResourceHandlerRegistry used for configuring resource handlers
 */
@Override
public void addResourceHandlers(final ResourceHandlerRegistry registry) {
    registry.addResourceHandler(
                    "/webjars/**",
                    "/img/**",
                    "/css/**",
                    "/js/**")
            .addResourceLocations(
                    "classpath:/META-INF/resources/webjars/",
                    "classpath:/static/img/",
                    "classpath:/static/css/",
                    "classpath:/static/js/");
}
}

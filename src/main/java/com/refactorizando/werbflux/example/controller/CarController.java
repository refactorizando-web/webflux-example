package com.refactorizando.werbflux.example.controller;

import com.refactorizando.werbflux.example.domain.Car;
import com.refactorizando.werbflux.example.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequiredArgsConstructor
@RequestMapping("cars")
public class CarController {

    private static final int DELAY_PER_ITEM_MS = 100;

    private final CarRepository carRepository;

    @GetMapping("/{id}")
    public Mono<Car> getById(@PathVariable Long id) {
        return carRepository.findById(id);
    }

    @GetMapping()
    public Flux<Car> getCars() {
        return carRepository.findAll().delayElements(Duration.ofMillis(DELAY_PER_ITEM_MS));
    }


}

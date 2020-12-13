package com.refactorizando.werbflux.example.repository;

import com.refactorizando.werbflux.example.domain.Car;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface CarRepository extends ReactiveSortingRepository<Car, Long> {
}

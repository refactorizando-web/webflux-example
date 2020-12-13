package com.refactorizando.werbflux.example.configuration;

import com.refactorizando.werbflux.example.domain.Car;
import com.refactorizando.werbflux.example.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.function.Supplier;

@Component
@Slf4j
@RequiredArgsConstructor

public class Configuration implements CommandLineRunner {

    private final CarRepository carRepository;

    Long l = 0L;

    @Override
    public void run(String... args) throws Exception {

        if (carRepository.count().block() == 0) {

            var idSupplier = getIdSequenceSupplier();
            
            var cars = List.of(new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Seat", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Seat", "Yellow"),
                    new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"), new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"), new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"), new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"), new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"), new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"), new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"), new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"), new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Seat", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "RENAULT", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Seat", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Seat", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Porsche", "Yellow"),
                    new Car(idSupplier.get(), "Seat", "Yellow"),
                    new Car(idSupplier.get(), "Ferrari", "Yellow"), new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "Ford", "Yellow"),
                    new Car(idSupplier.get(), "RENAULT", "Yellow"),
                    new Car(idSupplier.get(), "Seat", "Yellow")
            );


            carRepository.saveAll(cars).subscribe(car->log.info("Car saved {} ", car.toString()));

        }
    }

    private Supplier<Long> getIdSequenceSupplier() {
        return () -> l++;
    };
}
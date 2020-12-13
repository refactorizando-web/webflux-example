package com.refactorizando.werbflux.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
@AllArgsConstructor
@ToString
public class Car {

    @Id
    private Long id;

    private String brand;

    private String color;

}

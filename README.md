# Webflux Example

This project bornt with the aim of show an example with Spring WebFlux in reactive way.
If you want more information you can take a look into https://refactorizando.com/guia-webflux-spring-boot

## How does it run?

### Launch a docke compose with mongodb
First off you need to run a docker compose.
In the root of the project run the next command from a terminal:


    docker-compose up 

### Run your Spring Boot application

    mvn spring-boot:run

### Verify your reactive application

You can run a curl with event-stream to verify how works a flux with webflux.

    curl -H "Accept: text/event-stream" "http://localhost:8080/cars"



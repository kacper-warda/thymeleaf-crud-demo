package com.example.tlcrud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "no elo";
    }

    @GetMapping("/hello")
    public String hello() {
        return "no witam";
    }

    @GetMapping("/rateCar")
    public String rateMyCar(String carName) { // dodaje do adresu ?carName=fiat
        if (carName == null) {
            return "ale jaki samochód?";
        }
        if (Objects.equals(carName, "Ferrrari")) {
            return "ło panie, zazdrość w narodzie";
        } else if (Objects.equals(carName, "Passat")) {
            return "ło panie, prawdziwy polak";
        } else {
            return "ło panie co to za złom";
        }
    }

    @GetMapping("/passat")
    public String getPassat() {
        Car passat = new Car();
        passat.producer = "vw";
        passat.model = "passerati";
        passat.yearOfProduction = 2001;
        passat.millage = 87000.0;
        System.out.println(passat);
        return passat.toString();
    }

    @GetMapping("/fiat")
    public Car getFiat() {
        Car fiat = new Car();
        fiat.producer = "Fiat";
        fiat.model = "punto";
        fiat.yearOfProduction = 2011;
        fiat.millage = 287000.0;

        System.out.println(fiat);

        return fiat;
    }

    @GetMapping("/myCars")
    public List<Car> myCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Fiat", "Panda", 2005));
        cars.add(new Car("Fiat", "Tipo", 2010));
        cars.add(new Car("Fiat", "Bravo", 2015));
        return cars;
    }

    @GetMapping("/myCar")
    public Car myCar(String producer, String model, Integer yearOfProduction) {
        Car usersCar = new Car(producer, model, yearOfProduction);
        System.out.println("Samochód użytkownika: " + usersCar);
        return usersCar;
    }
}

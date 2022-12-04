package com.example.tlcrud;

public class Car {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Double millage;

    public Car() {
    }

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", millage=" + millage +
                '}';
    }
}

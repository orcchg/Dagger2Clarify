package com.orcchg.dagger2clarify.module_config;

public class Car {

    private final String label;

    Car(String label) {
        System.out.println("Car::ctor(" + label + ")");
        this.label = label;
    }

    void drive() {
        System.out.println("Car::drive, label = " + label);
    }
}

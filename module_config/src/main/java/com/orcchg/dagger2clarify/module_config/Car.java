package com.orcchg.dagger2clarify.module_config;

import javax.inject.Inject;

public class Car {

    @Inject Engine engine;

    private final String label;

    @Inject
    Car(String label) {
        System.out.println("Car::ctor");
        this.label = label;
    }

    void drive() {
        System.out.println("Car::drive");
        engine.start();
    }
}

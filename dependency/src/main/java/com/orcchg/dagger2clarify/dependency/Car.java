package com.orcchg.dagger2clarify.dependency;

import javax.inject.Inject;

public class Car {

    private final Engine engine;

    @Inject
    Car(Engine engine) {
        System.out.println("Car::ctor");
        this.engine = engine;
    }

    void drive() {
        System.out.println("Car::drive");
        engine.start();
    }
}

package com.orcchg.dagger2clarify.direct_inject;

import javax.inject.Inject;

public class Car {

    @Inject Engine engine;

    @Inject
    Car() {
        System.out.println("Car::ctor");
    }

    void drive() {
        System.out.println("Car::drive");
        engine.start();
    }
}

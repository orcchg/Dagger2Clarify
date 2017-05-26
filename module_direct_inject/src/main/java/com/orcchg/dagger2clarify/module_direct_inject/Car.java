package com.orcchg.dagger2clarify.module_direct_inject;

import javax.inject.Inject;

public class Car {

    @Inject Engine engine;

    Car() {
        System.out.println("Car::ctor");
    }

    void drive() {
        System.out.println("Car::drive");
        engine.start();
    }
}

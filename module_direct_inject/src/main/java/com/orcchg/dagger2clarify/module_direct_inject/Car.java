package com.orcchg.dagger2clarify.module_direct_inject;

import javax.inject.Inject;

public class Car {

    @Inject Engine engine;

    private final int id;

    Car(int id) {
        System.out.println("Car::ctor(" + id + ")");
        this.id = id;
    }

    void drive() {
        System.out.println("Car::drive, id = " + id);
        engine.start();
    }
}

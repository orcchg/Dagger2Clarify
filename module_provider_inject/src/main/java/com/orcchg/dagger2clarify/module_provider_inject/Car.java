package com.orcchg.dagger2clarify.module_provider_inject;

import javax.inject.Inject;
import javax.inject.Provider;

public class Car {

    @Inject Provider<Engine> engine;

    private final int id;

    @Inject
    Car(int id) {
        System.out.println("Car::ctor(" + id + ")");
        this.id = id;
    }

    void drive() {
        System.out.println("Car::drive, id = " + id);
        engine.get().start();
    }
}

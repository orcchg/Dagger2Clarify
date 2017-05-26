package com.orcchg.dagger2clarify.module_lazy_inject;

import dagger.Lazy;

import javax.inject.Inject;

public class Car {

    @Inject Lazy<Engine> engine;

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

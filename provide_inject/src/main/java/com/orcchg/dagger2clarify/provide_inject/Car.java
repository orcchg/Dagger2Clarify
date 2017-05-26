package com.orcchg.dagger2clarify.provide_inject;

import javax.inject.Inject;
import javax.inject.Provider;

public class Car {

    @Inject Provider<Engine> engine;

    @Inject
    Car() {
        System.out.println("Car::ctor");
    }

    void drive() {
        System.out.println("Car::drive");
        engine.get().start();
    }
}

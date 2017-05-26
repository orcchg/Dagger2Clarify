package com.orcchg.dagger2clarify.lazy_inject;

import dagger.Lazy;

import javax.inject.Inject;

public class Car {

    @Inject Lazy<Engine> engine;

    @Inject
    Car() {
        System.out.println("Car::ctor");
    }

    void drive() {
        System.out.println("Car::drive");
        engine.get().start();
    }
}

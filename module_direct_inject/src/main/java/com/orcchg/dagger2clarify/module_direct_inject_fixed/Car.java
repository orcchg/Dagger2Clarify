package com.orcchg.dagger2clarify.module_direct_inject_fixed;

public class Car {

    private final Engine engine;

    Car(Engine engine) {
        System.out.println("Car::ctor");
        this.engine = engine;
    }

    void drive() {
        System.out.println("Car::drive");
        engine.start();
    }
}

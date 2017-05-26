package com.orcchg.dagger2clarify.module_direct_inject_fixed;

public class Car {

    private final int id;
    private final Engine engine;

    Car(int id, Engine engine) {
        System.out.println("Car::ctor(" + id + ")");
        this.id = id;
        this.engine = engine;
    }

    void drive() {
        System.out.println("Car::drive, id = " + id);
        engine.start();
    }
}

package com.orcchg.dagger2clarify_module_interface_engine_ctor_wo_inject;

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

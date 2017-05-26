package com.orcchg.dagger2clarify.module_car_inject_ctor;

import javax.inject.Inject;

public class Car {

    private final String label;

    @Inject
    Car(String label) {
        System.out.println("Car::ctor(" + label + ")");
        this.label = label;
    }

    void drive() {
        System.out.println("Car::drive, label = " + label);
    }
}

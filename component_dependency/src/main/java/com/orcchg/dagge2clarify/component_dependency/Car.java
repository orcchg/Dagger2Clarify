package com.orcchg.dagge2clarify.component_dependency;

import javax.inject.Inject;

public class Car {

    private final Transmission transmission;

    @Inject
    Car(Transmission transmission) {
        System.out.println("Car::ctor");
        this.transmission = transmission;
    }

    void drive() {
        System.out.println("Car::drive");
        transmission.warm();
    }
}

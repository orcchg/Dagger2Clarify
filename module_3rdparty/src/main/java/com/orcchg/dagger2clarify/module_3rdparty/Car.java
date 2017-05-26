package com.orcchg.dagger2clarify.module_3rdparty;

import com.google.common.io.Closer;

import java.io.IOException;

public class Car {

    private final Closer closer;

    Car(Closer closer) {
        System.out.println("Car::ctor");
        this.closer = closer;
    }

    void drive() {
        System.out.println("Car::drive");
        try {
            closer.close();
        } catch (IOException e) {}
    }
}

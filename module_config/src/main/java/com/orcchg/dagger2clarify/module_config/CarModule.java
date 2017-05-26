package com.orcchg.dagger2clarify.module_config;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    private final String label;

    CarModule(String label) {
        this.label = label;
    }

    @Provides
    Car provideCar() {
        System.out.println("Module::provideCar");
        return new Car(label);
    }
}

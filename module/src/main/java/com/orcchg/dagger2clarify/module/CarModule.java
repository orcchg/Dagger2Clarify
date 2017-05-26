package com.orcchg.dagger2clarify.module;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    String provideString() {
        return "Opel Astra";
    }

    @Provides
    Car provideCar(String label) {
        System.out.println("Module::provideCar");
        return new Car(label);
    }
}

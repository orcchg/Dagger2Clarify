package com.orcchg.dagger2clarify.module_direct_inject;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    private static int id = 0;

    @Provides
    Car provideCar() {
        System.out.println("Module::provideCar, id = " + id);
        return new Car(id++);
    }
}

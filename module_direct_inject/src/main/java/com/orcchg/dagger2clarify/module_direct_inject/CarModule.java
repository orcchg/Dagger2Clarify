package com.orcchg.dagger2clarify.module_direct_inject;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    Car provideCar() {
        System.out.println("Module::provideCar");
        return new Car();
    }
}

package com.orcchg.dagger2clarify.module_direct_inject_fixed;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    private static int id = 0;

    @Provides
    Car provideCar(Engine engine) {
        System.out.println("Module::provideCar, id = " + id);
        return new Car(id++, engine);
    }
}

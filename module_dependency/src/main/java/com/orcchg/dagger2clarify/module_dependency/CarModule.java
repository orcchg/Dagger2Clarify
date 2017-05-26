package com.orcchg.dagger2clarify.module_dependency;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    Car provideCar(Engine engine) {
        System.out.println("Module::provideCar");
        return new Car(engine);
    }
}

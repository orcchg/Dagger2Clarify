package com.orcchg.dagger2clarify.module_interface;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    Engine provideEngine(CarburatorEngine engine) {
        System.out.println("Module::provideEngine");
        return engine;
    }

    @Provides
    Car provideCar(Engine engine) {
        System.out.println("Module::provideCar");
        return new Car(engine);
    }
}

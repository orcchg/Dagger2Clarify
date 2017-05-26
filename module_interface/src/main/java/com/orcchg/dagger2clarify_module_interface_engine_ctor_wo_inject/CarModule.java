package com.orcchg.dagger2clarify_module_interface_engine_ctor_wo_inject;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    Engine provideEngine() {
        System.out.println("Module::provideEngine");
        return new CarburatorEngine();
    }

    @Provides
    Car provideCar(Engine engine) {
        System.out.println("Module::provideCar");
        return new Car(engine);
    }
}

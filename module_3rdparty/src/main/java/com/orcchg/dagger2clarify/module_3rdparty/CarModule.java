package com.orcchg.dagger2clarify.module_3rdparty;

import com.google.common.io.Closer;
import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    Closer provideCloser() {
        System.out.println("Module::provideCloser");
        return Closer.create();
    }

    @Provides
    Car provideCar(Closer closer) {
        System.out.println("Module::provideCar");
        return new Car(closer);
    }
}

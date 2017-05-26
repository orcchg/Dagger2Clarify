package com.orcchg.dagger2clarify.module_car_inject_ctor;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    String provideString() {
        return "Opel Astra";
    }
}

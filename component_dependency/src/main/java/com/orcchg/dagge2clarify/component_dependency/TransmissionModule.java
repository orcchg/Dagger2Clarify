package com.orcchg.dagge2clarify.component_dependency;

import dagger.Module;
import dagger.Provides;

@Module
public class TransmissionModule {

    @Provides
    Transmission provideTransmission() {
        return new Transmission();
    }
}

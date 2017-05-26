package com.orcchg.dagge2clarify.component_dependency;

import dagger.Component;

@Component(modules = {TransmissionModule.class})
public interface TransmissionComponent {

    Transmission transmission();
}

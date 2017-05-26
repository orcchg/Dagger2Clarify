package com.orcchg.dagge2clarify.component_dependency;

import dagger.Component;

@Component(dependencies = {TransmissionComponent.class})
public interface CarComponent {

    Car car();
}

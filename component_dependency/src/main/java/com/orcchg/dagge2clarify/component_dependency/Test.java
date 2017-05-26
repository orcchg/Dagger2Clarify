package com.orcchg.dagge2clarify.component_dependency;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** component_dependency ***");
        TransmissionComponent transmissionComponent = DaggerTransmissionComponent.create();
        CarComponent carComponent = DaggerCarComponent.builder()
                .transmissionComponent(transmissionComponent)
                .build();
        carComponent.car().drive();
    }
}

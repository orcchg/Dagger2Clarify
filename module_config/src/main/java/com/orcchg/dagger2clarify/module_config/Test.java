package com.orcchg.dagger2clarify.module_config;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** module_config ***");
        CarComponent component = DaggerCarComponent.builder()
                .carModule(new CarModule("Opel Astra"))
                .build();
        component.car().drive();
    }
}

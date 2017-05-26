package com.orcchg.dagger2clarify.module_lazy_inject;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** module_lazy_inject ***");
        CarComponent component = DaggerCarComponent.builder()
                .carModule(new CarModule())
                .build();
        component.car().drive();
        component.car().drive();
        component.car().drive();
    }
}

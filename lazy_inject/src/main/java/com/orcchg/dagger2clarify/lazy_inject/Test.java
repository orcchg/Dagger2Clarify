package com.orcchg.dagger2clarify.lazy_inject;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** provider_inject ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

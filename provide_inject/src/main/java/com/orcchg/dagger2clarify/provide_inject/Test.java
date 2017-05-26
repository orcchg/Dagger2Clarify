package com.orcchg.dagger2clarify.provide_inject;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** provider_inject ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

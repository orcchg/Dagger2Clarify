package com.orcchg.dagger2clarify.module;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** module ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

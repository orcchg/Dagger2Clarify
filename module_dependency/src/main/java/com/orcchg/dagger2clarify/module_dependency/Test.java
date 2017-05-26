package com.orcchg.dagger2clarify.module_dependency;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** module_dependency ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

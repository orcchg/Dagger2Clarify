package com.orcchg.dagger2clarify.module_interface;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** module_interface ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

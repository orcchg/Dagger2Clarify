package com.orcchg.dagger2clarify.dependency;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** dependency ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
        component.car().drive();
        component.car().drive();
    }
}

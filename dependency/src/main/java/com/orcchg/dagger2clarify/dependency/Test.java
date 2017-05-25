package com.orcchg.dagger2clarify.dependency;

public class Test {

    public static void main(String[] args) {
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

package com.orcchg.dagger2clarify.module_3rdparty;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** module_3rdparty ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

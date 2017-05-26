package com.orcchg.dagger2clarify.module_direct_inject_fixed;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** module_direct_inject ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
        component.car().drive();
        component.car().drive();
    }
}

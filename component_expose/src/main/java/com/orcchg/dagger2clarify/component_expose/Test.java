package com.orcchg.dagger2clarify.component_expose;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** component_expose ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

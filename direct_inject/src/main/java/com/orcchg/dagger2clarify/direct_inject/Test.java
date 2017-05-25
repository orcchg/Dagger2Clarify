package com.orcchg.dagger2clarify.direct_inject;

public class Test {

    public static void main(String[] args) {
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

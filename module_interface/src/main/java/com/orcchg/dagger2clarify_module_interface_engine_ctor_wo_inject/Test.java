package com.orcchg.dagger2clarify_module_interface_engine_ctor_wo_inject;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** module_interface ***");
        CarComponent component = DaggerCarComponent.create();
        component.car().drive();
    }
}

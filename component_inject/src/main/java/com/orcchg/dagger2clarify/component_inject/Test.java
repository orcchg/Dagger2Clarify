package com.orcchg.dagger2clarify.component_inject;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** component_inject ***");
        CarComponent component = DaggerCarComponent.create();
        Car car = new Car();
        component.inject(car);
        car.drive();
    }
}

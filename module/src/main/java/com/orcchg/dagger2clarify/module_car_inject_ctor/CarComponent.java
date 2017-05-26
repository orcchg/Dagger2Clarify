package com.orcchg.dagger2clarify.module_car_inject_ctor;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface CarComponent {

    Car car();
}

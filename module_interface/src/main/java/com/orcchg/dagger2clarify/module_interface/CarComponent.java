package com.orcchg.dagger2clarify.module_interface;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface CarComponent {

    Car car();
}

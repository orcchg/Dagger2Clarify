package com.orcchg.dagger2clarify.module_3rdparty;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface CarComponent {

    Car car();
}

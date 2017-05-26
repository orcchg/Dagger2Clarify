package com.orcchg.dagger2clarify.module;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface CarComponent {

    Car car();
}

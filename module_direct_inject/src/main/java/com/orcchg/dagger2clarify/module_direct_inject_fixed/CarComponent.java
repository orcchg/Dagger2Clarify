package com.orcchg.dagger2clarify.module_direct_inject_fixed;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface CarComponent {

    Car car();
}

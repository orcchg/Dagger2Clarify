package com.orcchg.dagger2clarify.module_lazy_inject;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface CarComponent {

    Car car();
}

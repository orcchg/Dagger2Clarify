package com.orcchg.dagger2clarify.module_provider_inject;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface CarComponent {

    Car car();
}

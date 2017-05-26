package com.orcchg.dagger2clarify_module_interface_engine_ctor_wo_inject;

import dagger.Component;

@Component(modules = {CarModule.class})
public interface CarComponent {

    Car car();
}

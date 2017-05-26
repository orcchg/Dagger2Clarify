package com.orcchg.dagger2clarify_module_interface_engine_ctor_wo_inject;

public class CarburatorEngine implements Engine {

    CarburatorEngine() {
        System.out.println("Engine::ctor");
    }

    @Override
    public void start() {
        System.out.println("Engine::start");
    }
}

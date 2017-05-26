package com.orcchg.dagger2clarify.module_interface;

import javax.inject.Inject;

public class CarburatorEngine implements Engine {

    @Inject
    CarburatorEngine() {
        System.out.println("Engine::ctor");
    }

    @Override
    public void start() {
        System.out.println("Engine::start");
    }
}

package com.orcchg.dagger2clarify.module_lazy_inject;

import javax.inject.Inject;

public class Engine {

    @Inject
    Engine() {
        System.out.println("Engine::ctor");
    }

    void start() {
        System.out.println("Engine::start");
    }
}

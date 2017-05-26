package com.orcchg.dagger2clarify.component_expose;

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

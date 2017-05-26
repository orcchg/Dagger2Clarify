# Dagger 2 Clarify

Sample project that demonstrates various aspects of Dagger 2 through a set of extremely easy isolated samples. Each sample illustrates a particular Dagger's feature and doesn't interfere with the others.

It's very useful to compile samples and dive into generated Dagger's classes, and compare those for different samples to understand what is under the hood.

### component_inject

Engine has inject ctor. Car hasn't, but it requires Engine to be injected into field. Component uses members-injection method to inject Engine instance create by inject ctor into engine field in Car instance.

Another way to satisfy dependency on Engine of Car is to use Module which is aware of Engine ctor, like shown in **module_direct_inject** (package *_fixed*).

### direct_inject

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Component wires them.

### module_config

Car has configurable inject ctor with primitive parameter. Module is responsible for instantiation of Car with parameter. Component relies on Module. Module must be specified while building Component, because it has non-trivial configurable ctor.

### module_dependency

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Module is responsible for instantiation of Car. Component implementation relies on Module when a Car instance is requested.

### module_direct_inject

Engine has inject ctor. Car hasn't, but has an injectable field for Engine. Module is responsible for instantiation of Car. Component implementation relies on Module when a Car instance is requested, so it doesn't inject an Engine instance by itself, like it does in **direct_inject**. This leads to NPE when accessing engine field in Car instance.

Version in *_fixed* package eliminates NPE by passing an Engine instance into Module for provides-method, making Dagger aware of this dependency. Note, how DaggerCarComponent implementation has changed.

Another way to satisfy dependency on Engine of Car is to use members-injection method in Component, like shown in **component_inject**.

### module_interface

Engine is interface and CarburatorEngine is an implementation with inject ctor. Car requires Engine instance, but interfaces cannot be constructed. Module is responsible for proper Engine instantiation (via inject ctor) and also instantiates a Car instance. Component relies on Module when a Car instance is requested.

Version in *_engine_ctor_wo_inject* package has CarburatorEngine without inject ctor, so Module has to instantiate it explicitly.

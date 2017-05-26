### direct_inject

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Component wires them.

### module_config

Car has configurable inject ctor with primitive parameter. Module is responsible for instantiation of Car with parameter. Component relies on Module. Module must be specified while building Component, because it has non-trivial configurable ctor.

### module_dependency

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Module is responsible for instantiation of Car. Component implementation relies on Module when a Car instance is requested.

### module_direct_inject

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Module is responsible for instantiation of Car. Component implementation relies on Module when a Car instance is requested, so it doesn't inject an Engine instance by itself, like it does in **direct_inject**. This leads to NPE when accessing engine field in Car instance.

Version in *_fixed* package eliminates NPE by passing an Engine instance into Module for provides-method, making Dagger aware of this dependency. Note, how DaggerCarComponent implementation has changed.

### module_interface

Engine is interface and CarburatorEngine is an implementation with inject ctor. Car requires Engine instance, but interfaces cannot be constructed. Module is responsible for proper Engine instantiation (via inject ctor) and also instantiates a Car instance. Component relies on Module when a Car instance is requested.

Version in *_engine_ctor_wo_inject* package has CarburatorEngine without inject ctor, so Module has to instantiate it explicitly.

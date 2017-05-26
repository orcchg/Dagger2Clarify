### direct_inject

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Component wires them.

### module_config

Car has configurable inject ctor with primitive parameter. Module is responsible for instantiation of Car with parameter. Component relies on Module. Module must be specified while building Component, because it has non-trivial configurable ctor.

### module_direct_inject

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Module is responsible for instantiation of Car. Component implementation relies on Module when a Car instance is requested, so it doesn't inject an Engine instance by itself, like it does in **direct_inject**. This leads to NPE when accessing engine field in Car instance.

Version in *_fixed* package eliminates NPE by passing an Engine instance into Module for provides-method, making Dagger aware of this dependency. Note, how DaggerCarComponent implementation has changed.

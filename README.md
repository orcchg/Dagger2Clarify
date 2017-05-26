### direct_inject

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Component wires them.

### module_direct_inject

Engine has inject ctor. Car has inject ctor and injectable field for Engine. Module is responsible for instantiation of Car. Component implementation relies on Module when a Car instance is requested, so it doesn't inject an Engine instance by itself, like it does in **direct_inject**. This leads to NPE when accessing engine field in Car instance.

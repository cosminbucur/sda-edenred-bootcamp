# Information expert

Used to determine where to delegate responsibilities such as methods, computed fields
This will lead to placing the responsibility on the class with the most information required to fulfill it.

Why

- assign responsibility to objects

How

- a general approach to assigning responsibilities is to look at a given responsibility, determine the information
  needed to fulfill it, and then determine where that information is stored

# Creator

The creation of objects is one of the most common activities in an object-oriented system.

Why

- determine who creates an object

How

- apply FactoryPattern

# Controller

Assigns the responsibility of dealing with system events to a non-UI class that represents the overall system or a use
case scenario.

Why

- A controller object is a non-user interface object responsible for receiving or handling a system event

How

- The controller is defined as the first object beyond the UI layer that receives and coordinates ("controls") a system
  operation.
- The controller should delegate the work that needs to be done to other objects; it coordinates or controls the
  activity

# Indirection

Why

- support low coupling
- reuse potential

How

- Assign the responsibility to an intermediate object to mediate between other components or services so that they are
  not directly coupled.
- The intermediary creates an indirection between the other components

## Minimize Coupling

Coupling between modules/components is their degree of mutual interdependence; lower coupling is better. In other words,
coupling is the probability that code unit "B" will "break" after an unknown change to code unit "A".

Why

- A change in one module usually forces a ripple effect of changes in other modules.
- Assembly of modules might require more effort and/or time due to the increased inter-module dependency.
- A particular module might be harder to reuse and/or test because dependent modules must be included.
- Developers might be afraid to change code because they aren't sure what might be affected.

How

- Eliminate, minimise, and reduce complexity of necessary relationships.
- By hiding implementation details, coupling is reduced.
- Apply the Law of Demeter

> don't talk to strangers

## Maximize Cohesion

Cohesion of a single module/component is the degree to which its responsibilities form a meaningful unit; higher
cohesion is better.

Why

- hard to
    - understand modules
    - maintain a system, because logical changes in the domain affect multiple modules, and because changes in one
      module require changes in related modules.
    - reuse a module because most applications won’t need the random set of operations provided by a module.

How

- Group related functionalities sharing a single responsibility (e.g. in a class).

# Polymorphism

describes the concept that you can access objects of different types through the same interface. Each type can provide
its own independent implementation of this interface

Why

- code flexibility

How

- If the object successfully passes multiple is-a or instanceof tests, it’s polymorphic
- Static: compiler (overloading) - implement multiple methods within the same class that use the same name
- Dynamic: JVM (overriding) - within an inheritance hierarchy, a subclass can override a method of its superclass,
  enabling the developer of the subclass to customize or completely replace the behavior of that method

# Protected variations

# Pure fabrication

a class that does not represent a concept in the problem domain, specially made up to achieve low coupling, high
cohesion, and the reuse potential thereof derived. This kind of class is called a "service"

Why

- low coupling
- high cohesion

How

- implement a service

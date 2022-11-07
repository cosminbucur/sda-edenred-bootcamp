## Single Responsibility Principle

A class should never have more than one reason to change.

- persistence
- validation
- notification
- error handling
- logging
- class selection / instantiation
- formatting
- parsing
- mapping

Why

- Maintainability: changes should be necessary only in one module or class.

How

- Apply Curly's Law

> do one thing

# Curly's Law

choose a single, clearly defined goal for any particular bit of code: Do One Thing.

## Open/Closed Principle

Software entities (e.g. classes) should be open for extension, but closed for modification. I.e. such an entity can
allow its behavior to be modified without altering its source code.

Why

- Improve maintainability and stability by minimizing changes to existing code.

How

- Write classes that can be extended (as opposed to classes that can be modified).
- Expose only the moving parts that need to change, hide everything else.

## Liskov Substitution Principle

> Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that
> program.

## Inversion of Control

> Don't call us, we'll call you

it is a design principle in which custom-written portions of a computer program receive the flow of control from a
generic framework. Inversion of control carries the strong connotation that the reusable code and the problem-specific
code are developed independently even though they operate together in an application.

Why

- Inversion of control is used to increase modularity of the program and make it extensible.
- To decouple the execution of a task from implementation.
- To focus a module on the task it is designed for.
- To free modules from assumptions about how other systems do what they do and instead rely on contracts.
- To prevent side effects when replacing a module.

How

- Using Factory pattern
- Using Dependency Injection
- Using Template Method pattern
- Using Strategy pattern

## Interface Segregation Principle

Reduce fat interfaces into multiple smaller and more specific client specific interfaces. An interface should be more
dependent on the code that calls it than the code that implements it.

Why

- If a class implements methods that are not needed the caller needs to know about the method implementation of that
  class. For example if a class implements a method but simply throws then the caller will need to know that this method
  shouldn't actually be called.

How

- Avoid fat interfaces. Classes should never have to implement methods that violate the Single responsibility principle.

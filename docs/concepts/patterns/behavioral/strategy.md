# intent

Allows one of a family of algorithms to be selected on-the-fly at run-time

- use different algorithms within an object
- hide irrelevant implementation details of your algorithms
- replace massive conditionals with one-line method call

# participants

- strategy context - the context in which to apply the strategy
- strategy - the algorithm
- client - decides which strategy to use

# solution

- [classic](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/strategy/ex1/Client.java)
- [lambda](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/strategy/ex2/Client.java)
- [challenge](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/strategy/challenge/Client.java)

# jdk examples

- java.util.Collections.sort()

# intent

Allows an object to alter its behavior when its internal state changes

- Strategy is a bind-once pattern, State is more dynamic

# participants

- state - defines the operation each state must handle
- concrete state - state of the machine
- context - uses the state to see change in behavior when State changes
- client - uses the context

# solution

- [classic](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/state/ex1/Client.java)
- [challenge](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/state/challenge/Client.java)

# jdk examples

- java threads

# spring examples


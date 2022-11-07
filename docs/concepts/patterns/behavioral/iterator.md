# intent

Accesses the elements of an object sequentially without exposing its underlying representation

# participants

- Aggregator - creates the iterator
- Iterator - iterates over a data structure
- Client - uses the aggregator

# solution

- [classic](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/iterator/ex1/Client.java)
- [challenge](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/iterator/challenge/Client.java)

# jdk examples

- java.util.Iterator
- java.util.Enumeration
- java.util.Scanner

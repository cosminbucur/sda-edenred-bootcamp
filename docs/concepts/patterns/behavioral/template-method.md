# intent

Defines the skeleton of an algorithm as an abstract class, allowing its sub-classes to provide concrete behavior

# participants

- abstract class - defines the template method
- concrete class - implements the abstract methods
- client - uses the template method from the abstract class

# solution

- [classic](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/templatemethod/ex1/Client.java)
- [challenge](../../../../design-patterns/src/main/java/com/sda/patterns/behavioral/templatemethod/challenge/Client.java)

# jdk examples

- java.io.InputStream / OutputStream
- java.io.Reader / java.io.Writer
- java.util.AbstractList / AbstractSet / AbstractMap

# spring examples

- JdbcTemplate
- Java Message Service
- Java Persistence API

# intent

Ensures only one instance of an object is created

# participants

- singleton - provides a single instance of the object
- client - creates a singleton

# solution

- [eager initialized](../../../../design-patterns/src/main/java/com/sda/patterns/creational/singleton/ex1/Client.java)
- [static block](../../../../design-patterns/src/main/java/com/sda/patterns/creational/singleton/ex2/Client.java)
- [lazy initialized](../../../../design-patterns/src/main/java/com/sda/patterns/creational/singleton/ex3/Client.java)
- [thread safe](../../../../design-patterns/src/main/java/com/sda/patterns/creational/singleton/ex4/Client.java)
- [bill pugh](../../../../design-patterns/src/main/java/com/sda/patterns/creational/singleton/ex5/Client.java)

# jdk examples

- java.lang.Runtime#getRuntime()
- java.awt.Desktop#getDesktop()

# spring

- singleton beans

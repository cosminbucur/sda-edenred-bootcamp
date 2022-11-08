# intent

Allows for two incompatible classes to work together by wrapping an interface around one of the existing classes

# participants

- adaptee - the object that needs to be adapted
- target - the desired state
- adapter - converts from Adaptee to Adapter, using the Target interface
- client - use the Target

# solution

- [classic](../../../../design-patterns/src/main/java/com/sda/patterns/structural/adapter/ex1/Client.java)
- [challenge](../../../../design-patterns/src/main/java/com/sda/patterns/structural/adapter/challenge/Client.java)

# jdk examples

- java.util.Arrays#asList()
- java.io.InputStreamReader(InputStream)
- java.io.OutputStreamWriter(OutputStream)

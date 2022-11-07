# intent

Creation of family of objects without specifying their concrete type

- superclass can be an interface, abstract class or class

# participants

- abstract factory - defines methods to create families of classes
- abstract product - the created class
- client - uses the factory to create object

# solution

- [challenge](../../../../design-patterns/src/main/java/com/sda/patterns/creational/factoryabstract/challenge/Client.java)

# jdk examples

javax.xml.parsers.DocumentBuilderFactory#newInstance()
javax.xml.transform.TransformerFactory#newInstance()
javax.xml.xpath.XPathFactory#newInstance()

# intent

Creates objects without specifying the exact class to create.

- superclass can be an interface, abstract class or class

# participants

- creator - defines the factory method that creates
- product - the class created by the factory
- client - uses the factory

# solution

- [classic](../../../../design-patterns/src/main/java/com/sda/patterns/creational/factorymethod/ex1/Client.java)

# spring example

- BeanFactory.getBean(Type.class)

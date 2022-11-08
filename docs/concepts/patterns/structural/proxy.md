# intent

Provides a placeholder interface to an underlying object to control access, reduce cost, or reduce complexity

Remote proxy
They are responsible for representing the object located remotely.
Talking to the real object might involve marshalling and unmarshalling of data and talking to the remote object.
All that logic is encapsulated in these proxies and the client application need not worry about them.

Virtual proxy
These proxies will provide some default and instant results if the real object is supposed to take some time
to produce results. These proxies initiate the operation on real objects and provide a default result to the
application. Once the real object is done, these proxies push the actual data to the client where it has
provided dummy data earlier.

Protection proxy
If an application does not have access to some resource then such proxies will talk to the objects in
applications that have access to that resource and then get the result back.

Smart Proxy
A smart proxy provides additional layer of security by interposing specific actions when the object is accessed.
An example can be to check if the real object is locked before it is accessed to ensure that no other object can change
it.

# participants

- proxy - add additional logic and delegates to the real proxy subject
- real proxy subject - performs the actual request
- client - calls the proxy subject

# solution

- [classic](../../../../design-patterns/src/main/java/com/sda/patterns/structural/proxy/ex1/Client.java)
- [challenge](../../../../design-patterns/src/main/java/com/sda/patterns/structural/proxy/challenge/Client.java)

# jdk examples

- java.lang.reflect.Proxy
- javax.persistence.PersistenceContext

# spring

- transactions

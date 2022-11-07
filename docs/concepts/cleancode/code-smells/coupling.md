# Feature envy

[feature envy](../../../../design-patterns/src/main/java/com/sda/codesmells/featureenvy/bad/Customer.java)

# Inappropriate intimacy

One class uses the internal fields and methods of another class.
Classes should know as little as possible about each other.

# Message chains

object1.method()
object2.method()
object3.method()

Any changes in these relationships require modifying the client. Should hide delegate.

# Middle man

If a class performs only one action, delegating work to another class, maybe it should be removed.
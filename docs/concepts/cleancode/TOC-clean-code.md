# Code smells

- rigidity - hard to change
- fragility - a single change cause breakage
- immobility - hard to separate code
- viscosity - hack is faster
- needless repetition - copy paste
- opacity - difficult to understand
- needless complexity - smart developers

- [bloaters](code-smells/bloaters.md)
- [dispensable](code-smells/dispensables.md)
- [coupling](code-smells/coupling.md)
- [oop](code-smells/oop.md)

# Refactoring

[TOC refactoring](TOC-refactoring.md)

# Clean code rules

- before writing code
    - YAGNI
- existing code
    - Boy-Scout Rule
- new code
    - KISS
    - DRY
      [info](#DRY)
      [code](../../src/main/java/com/sda/cleancode/dry/before/Mechanic.java)

# How to be a boy scout

- Folder structure
    - backend
    - frontend

- Naming conventions
    - [indentation](../../src/main/java/com/sda/cleancode/conventions/DemoIndentation.java)
    - [class](../../src/main/java/com/sda/cleancode/conventions/DemoClass.java)
    - [comments](../../src/main/java/com/sda/cleancode/conventions/DemoComments.java)
    - [tests](../../src/test/java/com/sda/cleancode/tests/BookServiceTest.java)

# Software Design Principles

- [SOLID principles](principles/SOLID.md)
    - Single Responsibility Principle
    - Open / Closed Principle
    - Liskov’s Substitution Principle
    - Interface Segregation Principle
    - Dependency Inversion Principle

- [GRASP](principles/GRASP.md)

- [General design principles](principles/principles.md)

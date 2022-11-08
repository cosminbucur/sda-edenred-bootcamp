## DRY

> Don't Repeat Yourself

Every piece of knowledge must have a single, unambiguous, authoritative representation within a system.
Each significant piece of functionality in a program should be implemented in just one place in the source code.
Where similar functions are carried out by distinct pieces of code, it is generally beneficial to combine them into one
by abstracting out the varying parts.

- Why
    - duplication can lead to maintenance nightmares, poor factoring, and logical contradictions.
    - a modification of any single element of a system does not require a change in other logically unrelated elements.
    - elements that are logically related all change predictably and uniformly, and are thus kept in sync.

- How
    - Put business rules, long expressions, if statements, math formulas, metadata, etc. in only one place.
    - Identify the single, definitive source of every piece of knowledge used in your system, and then use that source
      to generate applicable instances of that knowledge (code, documentation, tests, etc).
    - Apply the Rule of three: It states that two instances of similar code do not require refactoring, but when similar
      code is used three times, it should be extracted into a new procedure

## YAGNI

> You ain't gonna need it!

Don't implement something until it is necessary.

- Why
    - Any work that's only used for a feature that's needed tomorrow, means losing effort from features that need to be
      done for the current iteration.
    - It leads to code bloat; the software becomes larger and more complicated.

- How
    - Always implement things when you actually need them, never when you just foresee that you need them.

# Boy-Scout Rule

> Leave the code cleaner than we found it

Why

- When making changes to an existing codebase the code quality tends to degrade, accumulating technical debt. Following
  the boyscout rule, we should mind the quality with each commit. Technical debt is resisted by continuous refactoring,
  no matter how small.

How

- With each commit make sure it does not degrade the codebase quality.
- Any time someone sees some code that isn't as clear as it should be, they should take the opportunity to fix it right
  there and then.

# KISS

> Keep it simple stupid

Most systems work best if they are kept simple rather than made complex.

- Why
    - Less code takes less time to write, has less bugs, and is easier to modify.
    - Simplicity is the ultimate sophistication.
    - It seems that perfection is reached not when there is nothing left to add, but when there is nothing left to take
      away.

## Do The Simplest Thing That Could Possibly Work

Why

- Real progress against the real problem is maximized if we just work on what the problem really is.

How

- Ask yourself: "What is the simplest thing that could possibly work?"

## Separation of Concerns

Separation of concerns is a design principle for separating a computer program into distinct sections, such that each
section addresses a separate concern. For example the business logic of the application is a concern and the user
interface is another concern. Changing the user interface should not require changes to business logic and vice versa.

Why

- Simplify development and maintenance of software applications.
- When concerns are well-separated, individual sections can be reused, as well as developed and updated independently.

How

- Break program functionality into separate modules that overlap as little as possible.

## Code For The Maintainer

Why

- Maintenance is by far the most expensive phase of any project.

How

- Be the maintainer
- Always code as if the person who ends up maintaining your code is a violent psychopath who knows where you live.
- Always code and comment in such a way that if someone a few notches junior picks up the code, they will take pleasure
  in reading and learning from it.
- Use the Principle of Least Astonishment / Surprise (POLA / POLS)
  > a component of a system should behave in a way that most users will expect it to behave.

## Avoid Premature Optimization

Donald Knuth
> We should forget about small efficiencies, say about 97% of the time:
> premature optimization is the root of all evil.
> Yet we should not pass up our opportunities in that critical 3%.

Understanding what is and isn’t "premature" is critical of course.

Why

- It is unknown upfront where the bottlenecks will be.
- After optimization, it might be harder to read and thus maintain.

How

- Make It Work Make It Right Make It Fast
- Don't optimize until you need to, and only after profiling you discover a bottleneck optimize that.

## Law of Demeter

> Don't talk to strangers

Why

- It usually tightens coupling
- It might reveal too much implementation details

How

- A method of an object may only call methods of:
    - The object itself.
    - An argument of the method.
    - Any object created within the method.
    - Any direct properties/fields of the object.

## Separation of Concerns

Separation of concerns is a design principle for separating a computer program into distinct sections, such that each
section addresses a separate concern. For example the business logic of the application is a concern and the user
interface is another concern. Changing the user interface should not require changes to business logic and vice versa.

Why

- Simplify development and maintenance of software applications.
- When concerns are well-separated, individual sections can be reused, as well as developed and updated independently.

How

- Break program functionality into separate modules that overlap as little as possible.
- MVC example

## Composition Over Inheritance

Why

- Less coupling between classes.
- Using inheritance, subclasses easily make assumptions, and break LSP.

How

- Test for LSP (substitutability) to decide when to inherit.
- Compose when there is a "has a" (or "uses a") relationship, inherit when "is a".

## Robustness Principle

> Be conservative in what you do, be liberal in what you accept from others

Collaborating services depend on each others interfaces. Often the interfaces need to evolve causing the other end to
receive unspecified data. A naive implementation refuses to collaborate if the received data does not strictly follow
the specification. A more sophisticated implementation will still work ignoring the data it does not recognize.

Why

- In order to be able to evolve services you need to ensure that a provider can make changes to support new demands
  while causing minimal breakage to their existing clients.

How

- Code that sends commands or data to other machines (or to other programs on the same machine) should conform
  completely to the specifications, but code that receives input should accept non-conformant input as long as the
  meaning is clear.

## Hide Implementation Details

A software module hides information (i.e. implementation details) by providing an interface, and not leak any
unnecessary information.

Why

- When the implementation changes, the interface clients are using does not have to change.

How

- Minimize accessibility of classes and members.
- Don’t expose member data in public.
- Avoid putting private implementation details into a class’s interface.
- Decrease coupling to hide more implementation details.

## Encapsulate What Changes

A good design identifies the hotspots that are most likely to change and encapsulates them behind an API. When an
anticipated change then occurs, the modifications are kept local.

Why

- To minimize required modifications when a change occurs

How

- Encapsulate the concept that varies behind an API
  Possibly separate the varying concept into its own module

## Command Query Separation

CQRS Command Query Responsibility Segregation

each method should be either a command that performs an action or a query that returns data to the caller but not both.
Asking a question should not modify the answer.

With this principle applied the programmer can code with much more confidence. The query methods can be used anywhere
and in any order since they do not mutate the state.
With commands one has to be more careful.

Why

- By clearly separating methods into queries and commands the programmer can code with additional confidence without
  knowing each method's implementation details.

How

- Implement each method as either a query or a command
- Apply naming convention to method names that implies whether the method is a query or a command

## Murphy's Law

> Anything that can go wrong will go wrong.

## Brooks's Law

> Adding manpower to a late software project makes it later.

Adding new developers to a software project does not make them productive immediately
but conversely takes time from the other team members due to communication overhead.

## Linus's Law

> Given enough eyeballs, all bugs are shallow.

The bugs will be identified if multiple developers inspect the piece of code before it's accepted and merged.
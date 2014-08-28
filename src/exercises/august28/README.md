August 28
=========

This is the set of questions we got after all that stuff about inheritance
and polymorphism. Doesn't really seem to have anything at all to do with that,
but well, let's just shut up and get on with it.

Exercise: SumAndAverage
=======================

The more attentive among us will have noticed that this exercise presumes that
we're going to do this with a `for` loop. How many of us actually did this? A
`while` loop would have made much more sense - but, oh, look, that's what
they're asking for next! Oh well..

**Q**) What is the difference between `for`, `while-do` and `do-while` loops?

**A**) Well..

A `for` loop iterates using a given expression. You have two options when using this kind of loop:

* A "smart" loop that automatically iterates over the members of a collection
    * This is often called a `for...in` loop
* A "dumb" loop designed to work with incrementing or decrementing integers

```java
// "Smart" (AKA `for...in`) loop

for (Type x: Collection<Type>) {
    // Do stuff with x
}

// "Dumb" loop

for (int i = 0; i < collection.length; i += 1) {
    // Do stuff with collection[i]
}
```

A `while-do` loop (more commonly known as a `while` loop) loops whilst checking a simple condition,
or anything that returns a `boolean` really. It will not start looping unless the condition returns
`true` the first time it's checked.

```java
while (someCondition()) {
    // Do something
    // Remember to somehow make the condition return false at some point (or break out of the loop)
}
```

A `do-while` loop is similar to a `while` loop, but it will always execute its contents at least once.

```java
do {
    // Do something
    // Happens at least once, even if the condition returns false
    // Remember to somehow make the condition return false at some point (or break out of the loop)
} while (someCondition());
```

Exercise: Product1ToN
=====================

Note here that the question asks what happens when you raise the product. If you're using an integer,
this will overflow at some point and you'll end up with a negative number. To solve this, I've used
longs instead, but those will also eventually overflow. This is an important aspect to programming
with numbers, so always keep it in mind!

Exercise: HarmonicSum
=====================

This is just more of the same. Have fun, guys!
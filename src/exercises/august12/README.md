August 12 exercises
===================

Today's exercises were designed to be done in pairs. I have to say, this
is the first time I've done pair programming on my own - but I guess, some
people feel like it's not necessary, regardless of how ridiculously common
and useful it is to have a second pair of eyes on your code.

The wording of most of these questions was, as ever, abysmal. For example, exercise
17..

```
Write and test a program that will take a number of words from the keyboard and
replace all occurrences of the letter E and replace with the letter O in each word,
treat E and e as the same.
```

Replace all occurrences of the letter E and replace with the letter O in each word. I presume
everyone was able to work this out - if not, go look at the class I wrote.

Notable questions
=================

There weren't really any particularly noticeable problems here, they were
all fairly standard String exercises, but there were a few things I picked up on
that might be useful in future.

Reversing strings and arrays
----------------------------

A few questions required this - and there's a few ways you can do these things.
The obvious way to reverse an array is to iterate through it in reverse, like so..

```java
String[] array = getStringArrayFromSomewhere();

for (int i = array.length() - 1; i >= 0; i -= 1) {
    // Do stuff
}
```

This works! But we're using Java, not C, and so there are easier and arguably
better ways of doing this. For example..

```java
String[] array = getStringArrayFromSomewhere();

// Cloning so we don't modify the original array
List<String> list = Arrays.asList(array.clone());

// This reverses 'list' in-place
Collections.reverse(list)
```

Now, isn't that so much cleaner?
We can do similar things for Strings..

```java
String str = getStringFromSomewhere();
char[] array = str.toCharArray();
String done = "";

for (int i = array.length() - 1; i >= 0; i -= 1) {
    done += array[i]; // For example
}
```

Again, this isn't C, we don't need to do these things. For
Strings, we can just use a StringBuilder.

```java
String str = getStringFromSomewhere();
String reversed = new StringBuilder(str).reverse().toString();
```
Wat?
====

Wat. Wat? Wat!

On looking over the course material, I noticed that our first "real" set of
exams will not include `try...catch`. It also doesn't seem to have anything
more than a cursory explanation of Exceptions, so I wrote this document.

Exceptions, and handling them
=============================

Arguably one of the most useful blocks in Java is the `try...catch` block. As
mentioned earlier, we're not being examined on it according to the first book,
so I'm going to cover it here.

```java
class TestClass {
    public Integer toInt(String input) {
        // Takes a string and converts it to an Integer.
        return Integer.parseInt(input);
    }
}
```

What's the problem with this method? toInt takes an input string, converts it
to an Integer, and returns it. Nothing too hard about that. To explain the problem
here, I'm going to first talk about exceptions.

Exceptions are how Java handles runtime errors. They're a pretty common language
feature these days, and they're designed so that you can handle them. So for
example, if `input` above contains `"hello"`, Integer.parseInt will cause an
exception - we call this throwing - which will cancel the function, and any
calling functions up the tree, until something tries to catch it, eventually
printing a stack trace if it never gets handled.

There are two ways we could deal with this. The first method is to tell anyone
using the function that it might end up throwing an exception.

```java
class TestClass {
    public Integer toInt(String input) throws NumberFormatException {
        // Takes a string and converts it to an Integer.
        return Integer.parseInt(input);
    }
}
```

This will warn everyone using your function that they should expect the
NumberFormatException and handle it in their program. This is an ideal way
to work with exceptions in come cases, but it's not so ideal in others, so
let's look at the second method.

```java
class TestClass {
    public Integer toInt(String input) {
        // Takes a string and converts it to an Integer.
        // Returns null if the string isn't a valid integer.
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
```

So, now we're handling the NumberFormatException and can return a specific value
in the case that the input is invalid, which anyone using your function would be
obliged to check for (especially since we're returning null, which could cause
NullPointerExceptions).

However, `try...catch` has another use.

Let's say we're writing a function using a Scanner. Good practise dictates that
we close the Scanner when we're done, but if an exception is raised and we return,
then we can't close the Scanner, right?

Well, wrong again. Let's take a look..

```java
class TestClass {
    public Integer toInt() {
        try {
            Scanner keyboard = new Scanner(System.in);
            return keyboard.nextInt();
        } catch (InputMismatchException e) {
            // Ideally you'd use hasNextInt() instead of this
            return null;
        } catch (NoSuchElementException e) {
            // Thrown if the input is exhausted
            return null;
        } catch (IllegalStateException e) {
            // Thrown if the Scanner is closed
            return null;
        } finally {
            keyboard.close();
        }
    }
}
```

Introducing: the `finally` block. The `finally` block is **always** executed, regardless
of what happens in the rest of the method. We can catch and exception and not
return anything, or we can even return some data - it doesn't matter what we
do, anything in the `finally` block will **always** happen, even if we don't
encounter any exceptions at all!

This is all pretty great, but what if we want to throw our own exceptions? Well,
we can do that too.

```java
class TestClass {
    public Integer toInt() throws IllegalArgumentException {
        try {
            Scanner keyboard = new Scanner(System.in);

            if (!keyboard.hasNextInt()) {
                throw new IllegalArgumentException("Scanner doesn't have an integer up next");
            }

            return keyboard.nextInt();
        } catch (NoSuchElementException e) {
            // Thrown if the input is exhausted
            return null;
        } catch (IllegalStateException e) {
            // Thrown if the Scanner is closed
            return null;
        } finally {
            keyboard.close();
        }
    }
}
```

We can even do this within our `try` block, although, as we're not catching it,
the exception will be thrown as expected. Remember, if you're doing this, to
declare that your method throws an exeption using `throwable`.
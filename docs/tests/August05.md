Test: August 5th
================

I did not like this test at all. I felt that it was quite backhanded
and contained a lot of trick questions, but at the same time, it's
worth covering.

I actually ended up marking two people's papers - They scored **3**
and **10** (our of 29), mostly because they didn't read the questions.
I ended up with 23, but I'm sure there were people that scored higher.

There were a lot of typos. I've corrected them in my analysis below, but
I'll still highlight them.

I'm not going to cover every question here - just the ones that jump
out at me.

Question 1
----------

Given:

```java
    public class ArithmeticResultsOutput {
        public static void main(String[] args) {
            int i = 0;
            int j = 0;

            if (i++ == ++j) {
                System.out.println("True: i=" + i + ", j=" + j);
            } else {
                System.out.println("False: i=" + i + ", j=" + j);
            }
        }
    }
```

What will be printed to standard out?

1. True: i=0, j=1
2. True: i=1, j=1
3. False: i=0, j=1
4. **False: i=0, j=1**

The answer is number four. This was a pretty straightforward question, but
requires an understanding of the pre-increment `++i` and post-increment `i++`
operators.

Simply, post-increment returns the original value of `i`, before raising it by one,
whilst pre-increment returns the value of `i` after it's been raised.
So, we can simplify our conditional here..

```java
            if (0 == 1) {
                System.out.println("True: i=" + i + ", j=" + j);
            } else {
                System.out.println("False: i=" + i + ", j=" + j);
            }
```

This is (of course) `false`, and since both `i` and `j` have been incremented by now,
our output is `False: i=0, j=1`.

When coding, my advice is to entirely avoid pre-increment and post-increment. They
were created for C and C++, where using them would be marginally more efficient than
using `i = i + 1` or even `i += 1`. However, this is Java, we're not compiling to
assembly, so there's no advantage to using these operators.

Instead, please use `+=` - other people reading your code will thank you for it.

Unless they're C programmers.

Question 2
----------

Given:

```java
    public class BooleanResultsOutput {
        public static void main(String[] args) {
            boolean booleanValue1 = true;
            boolean booleanValue2 = false;

            System.out.print(! (booleanValue1 & !booleanValue2) + ", ");
            System.out.print(! (booleanValue1 | !booleanValue2) + ", ");
            System.out.print(! (booleanValue1 ^ !booleanValue2));
        }
    }
```

What will be printed, considering the usage of the logical Boolean operators?

1. **false, false, true**
2. true, true, true
3. true, false, true
4. true, true, true

Tricky! To help us answer this, let's create a few truth tables.

**NOT** or `!`

| equation | result |
|----------|--------|
| `! F`    | T      |
| `! T`    | F      |

**AND** or `&`

| equation | result |
|----------|--------|
| `F & F`  | F      |
| `F & T`  | F      |
| `T & F`  | F      |
| `T & T`  | T      |

**OR** or `|`

| equation | result |
|----------|--------|
| `F | F`  | F      |
| `F | T`  | T      |
| `T | F`  | T      |
| `T | T`  | T      |

**XOR** or `^` (or Exclusive OR)

| equation | result |
|----------|--------|
| `F ^ F`  | F      |
| `F ^ T`  | T      |
| `T ^ F`  | T      |
| `T ^ T`  | F      |

The answer is number one. If you don't understand why, walking through the
boolean operations yourself, using the truth tables above. Remember, brackets come first!

Question 8
----------

A `switch` statement works with which wrapper class/reference type?

1. **Character**
2. **Byte**
3. **Short**
4. Int

Perhaps the most misleading question I've ever seen - instead of just one answer, they're
looking for three answers - number one, two and three. If you didn't have all of these,
you didn't get a point, which would be *outrageous* in a real exam.

Oh, and there's no boxed type named `Int` - it's called `Integer`.

This question is also incorrect, because `switch` statements support strings since Java 7.
For example..

```java
    String x = "hello";

    switch (x) {
        case "hello":
            System.out.println("world");
            break;
        default:
            System.out.println("Why don't you greet me!?");
    }
```

Nothing else really jumped out at me. If you want me to cover another question, ask me,
leave a comment on this commit, or create an issue.
Exercise One
============

This exercise was kind of long, so I decided to copy it here instead of
use code comments.

```java
package com.scjaexam.tutorial;

public class GreetingsUniverse {
    public static void main(String[] args) {
        System.out.println("Greetings, Universe!");
    }
}
```

* Compile and run the program.
    * `javac -d . GreetingsUniverse.java`
* Run the program to ensure it's error-free.
    * `java -cp . com.scjaexam.tutorial.GreetingsUniverse`
* Create three classes named `Earth`, `Mars` and `Venus` and place them
    within the `com.scja.exam.tutorial.planets` package. Create constructors
    that will print the names of the planets to standard out.
    * ```java
        package com.scja.exam.tutorial.planets;

        public class Earth {
            public Earth {
                System.out.println("Hello from Earth!");
            }
        }
      ```

* Instanciate each class from the main program by adding the necessary code to
    the GreetingsUniverse class.
    * `Earth e = new Earth();`
* Ensure that all of the source code is in the paths
    `src/com/scjaexam/tutorial/` and `src/com/scjaexam/tutorial/planets/`
    * They don't have to be exactly this, of course, and won't be for my purposes.
* Determine the command-line arguments needed to compile the complete program.
    Compile it and debug where necessary.
* Determine the command-line arguments needed to interpret the program. Run it.

Apparently, the output should read..

```
Greetings, Universe!
Hello from Earth!
Hello from Mars!
Hello from Venus!
```

I'm going to be handling this in two ways.
* The literal answer to the question - `literal/`
    * This will use **dumb classes** that have constructors with **side-effects**
    * Done: https://github.com/gdude2002/Training/tree/master/src/exercises/july31/literal
* The "correct" real-world way this might be implemented - `real/`
    * This will use **interfaces** and **no side-effects**
    * Done: https://github.com/gdude2002/Training/tree/master/src/exercises/july31/real

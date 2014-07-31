package exercises.july30;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to read a list of integer values which will find and display the
 * index of the first and last occurrence of the number 12. Your program should print
 * the index values -1 if the number 12 is not found.
 *
 * Yes, the exercise was /actually/ worded like this. Fml.
 */
class ExerciseTwo {

    public static void main(String[] args) {
        // Diamond types are awesome. They let us create a container of explicit type without actually
        // specifying the needed type, as it can be inferred from the declaration.
        // This was introduced in Java 7.
        // ...
        // An example of this is the call to new ArrayList<>(); below.
        // ...
        // I'd usually use Long but the question specified integers
        List<Integer> integers = new ArrayList<>();

        if (args.length < 1) {
            // This is a lot more realistic than using a Scanner..
            System.out.println("Please provide some numbers as arguments.");
            return;
        }

        for (String element : args) {
            int input;
            try {
                input = Integer.parseInt(element);
            } catch (java.lang.NumberFormatException e) {
                // ..at least, in part..
                System.out.println("Unknown number: '" + element + "' - skipping..");
                continue;
            }

            // We use two loops because we need to get rid of the numbers that are invalid.
            // An alternative approach would be to terminate instead, but we're writing a
            // "nice" program. \o/
            integers.add(input);
        }

        Integer first = -1;
        Integer last = -1;

        for (int i = 0; i < integers.size(); i += 1) {
            // This is the actual logic.
            if (first.equals(-1)) {
                // Then we know for sure it's the first index
                if (integers.get(i).equals(12)) {
                    first = i;
                    last = i;
                }
            } else {
                // It's not the first index, of course
                if (integers.get(i).equals(12)) {
                    last = i;
                }
            }
        }

        if (first.equals(last)) {
            System.out.println("Both indexes: " + first);
        } else {
            System.out.println("First index: " + first);
            System.out.println("Last index: " + last);
        }
    }
}

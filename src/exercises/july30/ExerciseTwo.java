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
public class ExerciseTwo {

    public static void main(String[] args) {
        // Diamond types are awesome. They let us create a container of explicit type without actually
        // specifying the needed type, as it can be inferred from the declaration.
        // This was introduced in Java 7.

        // An example of this is the call to new ArrayList<>(); below.
        List<Integer> ints = new ArrayList<>();

        if (args.length < 1) {
            System.out.println("Please provide some numbers as arguments.");
            return;
        }

        for (String element : args) {
            int input;
            try {
                input = Integer.parseInt(element);
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Unknown number: '" + element + "' - skipping..");
                continue;
            }
            ints.add(input);
        }

        Integer first = -1;
        Integer last = -1;

        for (int i = 0; i < ints.size(); i += 1) {
            if (first.equals(-1)) {
                if (ints.get(i).equals(12)) {
                    first = i;
                }
            } else {
                if (ints.get(i).equals(12)) {
                    last = i;
                }
            }
        }

        System.out.println("First index: " + first);
        System.out.println("Last index: " + last);
    }
}

package exercises.july30;

import java.util.ArrayList;
import java.util.List;

/**
 * Modify ExerciseThree so that it shows the current highest, lowest and average after
 * each successive number is entered.
 *
 * Last exercise didn't specify that we should be using a Scanner to read console
 * input. I still don't think that's what we want to do here, so I'm not using one,
 * but the wording of the question is pretty strange.
 *
 * Then again, they all are. Odd for a respected Java course.
 */
public class ExerciseFour {

    public static void main(String[] args) {
        // Diamond types are awesome. They let us create a container of explicit type without actually
        // specifying the needed type, as it can be inferred from the declaration.
        // This was introduced in Java 7.
        // ...
        // An example of this is the call to new ArrayList<>(); below.
        List<Long> longs = new ArrayList<>();

        if (args.length < 1) {
            // This is a lot more realistic than using a Scanner..
            System.out.println("Please provide some numbers as arguments.");
            return;
        }

        for (String element : args) {
            long input;
            try {
                input = Long.parseLong(element);
            } catch (java.lang.NumberFormatException e) {
                // ..at least, in part..
                System.out.println("Unknown number: '" + element + "' - skipping..");
                continue;
            }

            // We use two loops because we need to get rid of the numbers that are invalid.
            // An alternative approach would be to terminate instead, but we're writing a
            // "nice" program. \o/
            longs.add(input);
        }

        Long max = Long.MIN_VALUE; // The lowest value possible
        Long min = Long.MAX_VALUE; // The highest value possible

        // We use the two above values to save us from having to check for null
        // or some other arbitrary value

        Long total = 0L; // It's a long, suffix with "L"
        Long average = 0L; // This time, we do care about the value
        Long done = 0L;

        for (Long x : longs) {
            total += x;
            done += 1; // The number of numbers we've done; could also use a traditional for loop here
            average = total / done;

            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }

            // This isn't realistic at all, but it's what the question demands.
            // A real program for this purpose wouldn't constantly output in most cases.
            // ...
            // However, a Scanner /may/ be suitable for these as they appear to be programs
            // for end-users to use, rather than utilities.

            System.out.println("== Value #" + done + ": " + x + " ==");
            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);
            System.out.println("Average: " + average);
            System.out.println("");
        }

        System.out.println("== FINAL VALUES ==");
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

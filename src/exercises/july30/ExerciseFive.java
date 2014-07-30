package exercises.july30;

import java.util.ArrayList;
import java.util.List;

/**
 * Modify ExerciseFour so that it tells the user if the highest or lowest number has been entered
 * more than once, and if so, how many times.
 *
 * WHAT IS WITH THE WORDING? Jeez.
 */
public class ExerciseFive {

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
        Long maxTimes = 0L;

        Long min = Long.MAX_VALUE; // The highest value possible
        Long minTimes = 0L;

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
                maxTimes = 1L; // It's the first time we've seen this number
            } else if (x.equals(max)) {
                maxTimes += 1; // We've seen this number before
            }

            if (x < min) {
                min = x;
                minTimes = 1L; // It's the first time we've seen this number
            } else if (x.equals(min)) {
                minTimes += 1; // We've seen this number before
            }

            // This isn't realistic at all, but it's what the question demands.
            // A real program for this purpose wouldn't constantly output in most cases.
            // ...
            // However, a Scanner /may/ be suitable for these as they appear to be programs
            // for end-users to use, rather than utilities.

            System.out.println("== Value #" + done + ": " + x + " ==");

            System.out.println("Largest number: " + max);
            if (maxTimes > 1) { // If we've only seen the number once, this is obvious
                System.out.println("  " + max + " has been entered " + maxTimes + " times.");
            }

            System.out.println("Smallest number: " + min);
            if (minTimes > 1) { // If we've only seen the number once, this is obvious
                System.out.println("  " + min + " has been entered " + minTimes + " times.");
            }

            System.out.println("Average: " + average);
            System.out.println("");
        }

        System.out.println("== FINAL VALUES ==");

        System.out.println("Largest number: " + max);
        if (maxTimes > 1) {
            System.out.println("  " + max + " has been entered " + maxTimes + " times.");
        }

        System.out.println("Smallest number: " + min);
        if (minTimes > 1) {
            System.out.println("  " + min + " has been entered " + minTimes + " times.");
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

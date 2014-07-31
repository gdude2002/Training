package exercises.july30;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to find the largest, smallest and average value of a
 * collection of numbers.
 *
 * And look! We're using Longs, because who knows how many keys the user
 * will smash for their numbers.
 */
class ExerciseThree {

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
        Long average;  // Uninitialized; we don't care about this until it's been set

        // No need to use indexes, especially since we don't care which number
        // we're working with, for the most part
        for (Long x : longs) {
            // Again, the actual logic is in this loop
            // We keep a total sum so that we can get the average
            total += x;

            if (x > max) {
                // If it's larger than max..
                max = x;
            } else if (x < min) {
                // ..then it can't be smaller than min
                min = x;
            }
        }

        average = total / longs.size();

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

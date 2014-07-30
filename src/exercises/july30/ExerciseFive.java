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

        // An example of this is the call to new ArrayList<>(); below.
        List<Long> longs = new ArrayList<>();

        if (args.length < 1) {
            System.out.println("Please provide some numbers as arguments.");
            return;
        }

        for (String element : args) {
            long input;
            try {
                input = Long.parseLong(element);
            } catch (NumberFormatException e) {
                System.out.println("Unknown number: '" + element + "' - skipping..");
                continue;
            }
            longs.add(input);
        }

        Long max = Long.MIN_VALUE;
        Long maxTimes = 0L;

        Long min = Long.MAX_VALUE;
        Long minTimes = 0L;

        Long total = 0L;
        Long average = 0L;
        Long done = 0L;

        for (Long x : longs) {
            total += x;
            done += 1;
            average = total / done;

            if (x > max) {
                max = x;
                maxTimes = 1L;
            } else if (x.equals(max)) {
                maxTimes += 1;
            }

            if (x < min) {
                min = x;
                minTimes = 1L;
            } else if (x.equals(min)) {
                minTimes += 1;
            }

            System.out.println("== Value #" + done + ": " + x + " ==");

            System.out.println("Largest number: " + max);
            if (maxTimes > 1) {
                System.out.println("  " + max + " has been entered " + maxTimes + " times.");
            }

            System.out.println("Smallest number: " + min);
            if (minTimes > 1) {
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

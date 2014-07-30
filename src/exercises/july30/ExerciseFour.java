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
        List<Long> longs = new ArrayList<Long>();

        if (args.length < 1) {
            System.out.println("Please provide some numbers as arguments.");
            return;
        }

        for (String element : args) {
            long input;
            try {
                input = Long.parseLong(element);
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Unknown number: '" + element + "' - skipping..");
                continue;
            }
            longs.add(input);
        }

        Long max = Long.MIN_VALUE;
        Long min = Long.MAX_VALUE;
        Long total = 0L;
        Long average = 0L;
        Long done = 0L;

        for (Long x : longs) {
            total += x;
            done += 1;
            average = total / done;

            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }

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

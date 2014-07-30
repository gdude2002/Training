package exercises.july30;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to find the largest, smallest and average value of a
 * collection of numbers.
 */
public class ExerciseThree {

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

        for (Long x : longs) {
            total += x;

            if (x > max) {
                max = x;
            } else if (x < min) {
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

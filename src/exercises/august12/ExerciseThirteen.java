package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 */
public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;

        System.out.print("Input some words: ");
        input = kb.nextLine();

        do {
            input = input.replace("\n", "");
            input = input.replace("\r", "");
            input = input.trim();

            String[] words = input.split(" ");
            Long count = 0L;

            // Use max and min, to cover everything
            Long min = Long.MAX_VALUE;
            Long max = Long.MIN_VALUE;
            Long average = 0L;

            for (String x : words) {
                if (x.matches("[A-Za-z]+")) {
                    // I love regular expressions.
                    count += 1;

                    Long len = (long) x.length();
                    average += len;

                    if (len > max) {
                        max = len;
                    }

                    if (len < min) {
                        min = len;
                    }
                }
            }

            average /= count;

            System.out.printf("Words containing only letters: %s\n", count);
            System.out.printf("Avg length: %s / Max length: %s / Min length: %s\n", average, max, min);

            System.out.print("Input some words: ");
            input = kb.nextLine();
        } while (! input.equals("End"));
    }
}

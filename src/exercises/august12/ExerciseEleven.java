package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Modify the program at [ExerciseTen] so that it clears the screen before prompting
 * for input, keeps prompting for and analysing input until the user enters the string "End".
 */
public class ExerciseEleven {
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
            long count = 0;

            for (String x : words) {
                if (x.matches("[A-Za-z]+")) {
                    // I love regular expressions.
                    count += 1;
                }
            }

            System.out.printf("Words containing only letters: %s\n", count);

            System.out.print("Input some words: ");
            input = kb.nextLine();
        } while (! input.equals("End"));

        kb.close();
    }
}

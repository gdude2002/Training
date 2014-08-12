package exercises.august12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * -- Gareth Coles
 * Modify the program at [ExerciseEleven] so that it outputs the words inputted
 * by the user in reverse order ("This word is 3 chars" becomes "chars 3 is word This")
 */
public class ExerciseTwelve {
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

            List<String> reversed = Arrays.asList(words);
            Collections.reverse(reversed);

            System.out.print("Reversed input: ");

            for (String x : reversed) {
                System.out.printf("%s ", x);
            }
            System.out.println();

            System.out.printf("Words containing only letters: %s\n", count);

            System.out.print("Input some words: ");
            input = kb.nextLine();
        } while (! input.equals("End"));

        kb.close();
    }
}

package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Write and test a program that will take a number of words from the
 * keyboard and find the first occurrence of the letter E in each word, treat
 * E and e as the same.
 */
public class ExerciseSixteen {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter some words: ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        String[] words = input.split(" ");

        for (String x : words) {
            int r = findE(x);

            if (r > -1) {
                System.out.printf("First 'E'/'e' in '%s': %s\n", x, r);
            } else {
                System.out.printf("No 'E'/'e' in '%s'", x);
            }
        }
    }

    private static int findE(String input) {
        int result = input.indexOf('e');
        int result2 = input.indexOf('E');

        if (result < result2) {
            return result2;
        }
        return result;
    }
}

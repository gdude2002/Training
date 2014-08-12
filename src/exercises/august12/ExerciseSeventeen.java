package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Write and test a program that will take a number of words from the keyboard and
 * replace all occurrences of the letter E and replace with the letter O in each word,
 * treat E and e as the same.
 *
 * Wow, I love that wording... Or should I say, I lovO that wording?
 */
public class ExerciseSeventeen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input some text: ");

        String input = kb.nextLine();
        input = input.replace('e', 'O');
        input = input.replace('E', 'O');

        System.out.println(input);
    }
}

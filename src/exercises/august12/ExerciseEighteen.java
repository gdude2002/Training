package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Write and test a program that will take a number of words from the keyboard
 * and outputs only the words ending with "ing".
 */
public class ExerciseEighteen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input some text: ");

        String input = kb.nextLine();
        input = input.trim();

        String[] words = input.split(" ");

        System.out.println("== Words ending with -ing ==");

        for (String x : words) {
            if (x.toLowerCase().endsWith("ing")) {
                System.out.println(x);
            }
        }

        kb.close();
    }
}

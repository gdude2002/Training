package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Write a program which will input a string from the keyboard, output the number of
 * separate words, where a word is one or more characters separated by spaces. Your
 * program should only count words as groups of characters in the range A...Z and a...z.
 */
public class ExerciseTen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input some words: ");

        String input = kb.nextLine();
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
    }
}

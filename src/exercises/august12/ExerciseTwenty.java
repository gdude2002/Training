package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Write and test a program that will take a number of words from the keyboard
 * and outputs only the words containing the substring "ava".
 */
public class ExerciseTwenty {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input some text: ");

        String input = kb.nextLine();
        input = input.trim();

        String[] words = input.split(" ");

        System.out.println("== Words containing \"ava\" ==");

        for (String x : words) {
            if (x.toLowerCase().contains("ava")) {
                System.out.println(x);
            }
        }

        kb.close();
    }
}

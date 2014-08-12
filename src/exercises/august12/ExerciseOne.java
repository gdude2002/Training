package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 *
 * Write a test program which will prompt the user t enter their name and write
 * to the screen just the surname (Where surname is interpreted as everything after
 * the first space).
 */
public class ExerciseOne {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        String[] names = input.split(" ", 2);

        if (names.length > 1) {
            System.out.println(String.format("Your last name is %s", names[1]));
        } else {
            System.out.println("Please enter a last name.");
        }

        kb.close();
    }
}

package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Modify the program produced at [ExerciseOne] so that it writes out the user's input with
 * any middle name removed.
 */
public class ExerciseNine {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        String[] names = input.split(" ");

        if (names.length > 1) {
            System.out.println(String.format("Your name is %s %s", names[0], names[names.length - 1]));
        } else {
            System.out.println("Please enter at least a first and last name.");
        }
    }
}

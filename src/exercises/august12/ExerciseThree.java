package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Modify the program produced at [ExerciseOne] so that it writes out the number of
 * characters in the user input.
 */
public class ExerciseThree {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        int chars = input.length();
        String[] names = input.split(" ", 2);

        if (names.length > 1) {
            System.out.println(String.format("Your last name is %s", names[1]));
            System.out.println(String.format("There are %s characters in your name, including spaces.", chars));
        } else {
            System.out.println("Please enter a last name.");
            System.out.println(String.format("There are %s characters in your name, including spaces.", chars));
        }
    }
}

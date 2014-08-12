package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Modify the program produced at [ExerciseOne] so that it writes out the users input
 * reversed (Joe Doe is output as eoD eoJ).
 */
public class ExerciseFive {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        String[] names = input.split(" ", 2);
        String reversed = new StringBuilder(input).reverse().toString();

        if (names.length > 1) {
            System.out.println(String.format("Your last name is %s", names[1]));
            System.out.println(String.format("Reversed input: %s", reversed));
        } else {
            System.out.println("Please enter a last name.");
            System.out.println(String.format("Reversed input: %s", reversed));
        }

        kb.close();
    }
}

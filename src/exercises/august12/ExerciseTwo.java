package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Modify the program produced in [ExerciseOne] so that it writes out the first name
 * (everything up to the first space) instead of the surname.
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        String[] names = input.split(" ", 2);

        System.out.println(String.format("Your first name is %s", names[0]));
    }
}

package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Modify the program produced at [ExerciseOne] so that it writes out the number of
 * uppercase characters in the user's input.
 */
public class ExerciseFour {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        String[] names = input.split(" ", 2);

        int upperCase = 0;

        for (int i = 0; i < input.length(); i += 1) {
            if (Character.isUpperCase(input.charAt(i))) {
                upperCase += 1;
            }
        }

        if (names.length > 1) {
            System.out.println(String.format("Your last name is %s", names[1]));
            System.out.println(String.format("Your name contains %s capital letters.", upperCase));
        } else {
            System.out.println("Please enter a last name.");
            System.out.println(String.format("Your name contains %s capital letters.", upperCase));
        }

        kb.close();
    }
}

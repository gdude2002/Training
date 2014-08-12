package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Modify the program produced at [ExerciseOne] so that it writes out the number
 * of the occurrences of the letter a in the users input. (Treat A and a as the same).
 */
public class ExerciseEight {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        String[] names = input.split(" ", 2);
        int count = 0;

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count += 1;
            }
        }

        if (names.length > 1) {
            System.out.println(String.format("Your last name is %s", names[1]));
            System.out.println(String.format("Occurrences of the letters 'a' and 'A': %s", count));
        } else {
            System.out.println("Please enter a last name.");
            System.out.println(String.format("Occurrences of the letter 'a' and 'A': %s", count));
        }

        kb.close();
    }
}

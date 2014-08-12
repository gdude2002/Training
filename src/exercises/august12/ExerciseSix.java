package exercises.august12;

import java.lang.reflect.Array;
import java.util.*;

/**
 * -- Gareth Coles
 * Modify the program produced at [ExerciseOne] so that it writes out the users input with
 * the names reversed (Joe Doe becomes Doe Joe).
 */
public class ExerciseSix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What's your name? ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.replace("\r", "");
        input = input.trim();

        String[] names = input.split(" ", 2);
        List<String> namesList = Arrays.asList(names.clone());
        Collections.reverse(namesList); // Now it's reversed

        if (names.length > 1) {
            System.out.println(String.format("Your last name is %s", names[1]));
            System.out.print("Reversed input: ");

            for (String x : namesList) {
                System.out.print(x + " ");
            }
        } else {
            System.out.println("Please enter a last name.");
        }
    }
}

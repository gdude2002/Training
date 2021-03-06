package exercises.july23;

import java.util.Scanner;

/**
 * Write a program which asks the user for two numbers. It then indicates whether the
 * first number is exactly divisible by the second number.
 */

class ExerciseFour {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please input a number: ");
        int first = keyboard.nextInt();

        System.out.print("Please input another number: ");
        int second = keyboard.nextInt();

        System.out.println(
                "First number is" +
                (((first % second) == 0) ? " " : " not ") +
                "equally divisible by the second."
        );

        keyboard.close();
    }
}

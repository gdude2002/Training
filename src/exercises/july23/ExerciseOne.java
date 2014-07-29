package exercises.july23;

import java.util.Scanner;

/**
 * Write a program in which the user enters an integer value. Depending on the input, the program
 * will output whether the number is greater than, less than, or equal to zero.
 */

class ExerciseOne {

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int x = keyboard.nextInt();

        if (x > 0) {
            System.out.println(String.format("%s is greater than 0.", x));
        } else if (x == 0) {
            System.out.println(String.format("%s is equal to 0.", x));
        } else {
            System.out.println(String.format("%s is less than 0.", x));
        }

        keyboard.close();
    }
}

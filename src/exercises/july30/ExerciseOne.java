package exercises.july30;

import java.util.Scanner;

/**
 * Write a program that will find the sum of a collection of data values.
 *
 * Your program should terminate when a zero value is read.
 */
public class ExerciseOne {

    public static void main(String[] args) {
        long total = 0;
        long input;
        long inputs = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input some numbers. Input 0 to finish.\n");

        do {
            if (keyboard.hasNextLong()) {
                System.out.print("> ");
                input = keyboard.nextLong();
                keyboard.nextLine();  // nextLong() doesn't advance past the newline,
                                      // but we need to for error checking
                total += input;
                inputs += 1;
            } else {
                input = -1L;
                System.out.println("Unknown number: " + keyboard.nextLine());
                // Can't output here for some reason.
            }
        } while (input != 0);

        System.out.println();
        System.out.println("\nTotal: " + total);
        System.out.println("Values read: " + inputs);
    }
}

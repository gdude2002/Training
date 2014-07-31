package exercises.july30;

import java.util.Scanner;

/**
 * Write a program that will find the sum of a collection of data values.
 *
 * Your program should terminate when a zero value is read.
 */
class ExerciseOne {

    public static void main(String[] args) {
        long total = 0;
        long input;
        long inputs = 0;

        // This is an odd way to do this; if we were writing a program like this
        // in the real world, it would either take the numbers from our arguments
        // String list, or be written as a library.
        // ...
        // Of course, these questions aren't very applicable to the real world;
        // they're more about the intricacies of the language.
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
                // Can't output here for some reason. Probably because of the Scanner.
                // ...
                // We wouldn't realistically use Scanner in the real world. I've only
                // ever seen it used in tutorials, anyway.
            }
        } while (input != 0);

        System.out.println(); // Blank line to clear from the input
        System.out.println("\nTotal: " + total);
        System.out.println("Values read: " + inputs);

        keyboard.close(); // Because we're good programmers!
    }
}

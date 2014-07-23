package exercises.july23;

import java.util.Scanner;

public class ExerciseFour {
    public static Scanner keyboard = new Scanner(System.in);

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
    }
}

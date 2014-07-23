package exercises.july23;

import java.util.Scanner;

public class ExerciseThree {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please input a number: ");
        long num = keyboard.nextLong();

        System.out.println(
                "Number is " +
                (((num % 2) == 0) ? "even" : "odd")
        );
    }
}

package exercises.july23;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create a program to ask the user how many grades they want to enter. It will calculate the
 * average mark and indicate whether the mark is a..
 *
 * > Distinction    70 - 100
 * > Merit 1        63 - 69
 * > Merit 2        55 - 62
 * > Pass           40 - 50
 * > Fail           < 40
 */

class ExerciseTwo {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many grades do you want to enter? ");
        int numGrades = keyboard.nextInt();

        if (numGrades <= 0) {
            System.out.println(String.format("Invalid number: %s - The number should be greater than 0.", numGrades));
            return;
        }

        ArrayList<Integer> grades = new ArrayList<>();
        int current = 0;

        while (current < numGrades) {
            grades.add(getGrade());
            current += 1; // Because I'm verbose.
        }

        int total = 0;
        int average;

        for (int grade : grades) {
            total += grade;
        }

        average = (total / grades.size());

        System.out.println(String.format("Total: %s / Average: %s", total, average));

        if (average >= 70) {
            System.out.println("Grade: DISTINCTION");
        } else if (average >= 63) {
            System.out.println("Grade: MERIT ONE");
        } else if (average >= 55) {
            System.out.println("Grade: MERIT TWO");
        } else if (average >= 40) {
            System.out.println("Grade: PASS");
        } else {
            System.out.println("Grade: FAIL");
        }

        keyboard.close();
    }

    private static int getGrade() {
        System.out.print("Please enter a grade between 0 and 100: ");

        int input = keyboard.nextInt();

        if (input < 0 || input > 100) {
            System.out.println(String.format("Grade %s is not between 0 and 100, please try again.", input));
            return getGrade();
        }

        return input;
    }
}

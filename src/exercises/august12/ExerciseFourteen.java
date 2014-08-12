package exercises.august12;

import java.util.Scanner;

/**
 * -- Gareth Coles
 * Write and test a program to take input from the keyboard and test to see
 * if the inputted string is a palindrome.
 */
public class ExerciseFourteen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Palindrome checker!");
        System.out.println("Please note that spaces are ignored and all input is lowered.");
        System.out.println("Punctuation is not removed.");
        System.out.println();
        System.out.print("Please enter some text: ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.replace("\r", "");
        input = input.replace(" ", "");
        input = input.trim();
        input = input.toLowerCase();

        if (isPalindrome(input)) {
            System.out.println("Input is a palindrome.");
        } else {
            System.out.println("Input is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();

        for (int i = 0; i < input.length(); i += 1) {
            char left = input.charAt(i);
            char right = reversed.charAt(i);

            if (left != right) {
                return false;
            }
        }

        return true;
    }
}

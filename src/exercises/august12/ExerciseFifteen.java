package exercises.august12;

import java.util.*;

/**
 * -- Gareth Coles
 * Write and test a program that take two words and output the words in
 * lexicographic order
 */
public class ExerciseFifteen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter some words: ");

        String input = kb.nextLine();
        input = input.replace("\n", "");
        input = input.trim();

        String[] words = input.split(" ", 2);
        List<String> sorted = Arrays.asList(words);

        Collections.sort(sorted);

        System.out.print("Words in lexicographical order: ");

        for (String x : sorted) {
            System.out.printf("%s ", x);
        }

        kb.close();
    }
}

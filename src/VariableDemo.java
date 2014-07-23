/**
 * Created by Gareth Coles on 15/07/2014
 *
 * Program to demo some variables.
 */
public class VariableDemo {
    public static void main(String[] args) {
        int number;
        Integer boxedNumber;

        number = 15;
        boxedNumber = 15;

        System.out.println(String.format("Number: %s", number));
        System.out.println(String.format("Boxed number: %s", boxedNumber));

        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        number = 25;
        boxedNumber = 25;

        System.out.println(String.format("Number: %s", number));
        System.out.println(String.format("Boxed number: %s", boxedNumber));
    }
}

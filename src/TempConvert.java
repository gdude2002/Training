/**
 * Created by Gareth on 17/07/2014
 *
 * Temperature conversion app. Does Celcius and Fahrenheit.
 */
public class TempConvert {
    public static void main(String[] args) {
        if (args.length < 1) {
            // Nothing specified on commandline
            System.out.println("Please specify a temperature (in Celcius or Fahrenheit). For example:");
            System.out.println("* 32F");
            System.out.println("* 15.7C");
        } else {
            // Get our input
            String input = args[0],
                   // Last character of the string
                   finalChar = ((Character) input.charAt(input.length() - 1)).toString(),
                   // Everything except the last character
                   substr = input.substring(0, input.length() - 1);

            double degrees, result;

            try {
                // Try to convert the temperature to a double
                degrees = Double.parseDouble(substr);
            } catch (NumberFormatException e) {
                // Not a valid double
                System.out.println(String.format("%s is not a number.", substr));
                return;
            }

            if (!isAlpha(finalChar)) {
                // Final character isn't a letter
                System.out.println("Temperature must be in the form <degrees><unit>");
                System.out.println("For example: 32F or 15.7C");
                return;
            }

            if (finalChar.equalsIgnoreCase("f")) {
                // Fahrenheit
                result = fToC(degrees);
                System.out.println(String.format("%s Fahrenheit is %s Celsius", degrees, result));
            } else if (finalChar.equalsIgnoreCase("c")) {
                // Celcius
                result = cToF(degrees);
                System.out.println(String.format("%s Celsius is %s Fahrenheit", degrees, result));
            } else {
                // Something else
                System.out.println(String.format("I don't know what kind of temperature '%s' is.", finalChar));
            }
        }
    }

    public static double cToF(double degrees) {
        // Brackets for verbosity
        return ((degrees * 9) / 5) + 32;
    }

    public static double fToC(double degrees) {
        // Brackets for verbosity
        return ((degrees - 32) * 5) / 9;
    }

    public static boolean isAlpha(String input) {
        // Check that the input string is just uppercase and lowercase letters
        return input.matches("[a-zA-Z]+");
    }
}

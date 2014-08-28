package exercises.august28.sumandaverage;

public class SumAndAverageSevens {

    public static void main(String[] args) {

        int total = 0;
        int i;
        float average;

        String mode = null;

        for (String arg : args) {
            if (mode != null) {
                break;
            }

            switch (arg.toLowerCase()) {
                case ("for"):
                    mode = "for";
                    break;
                case ("while-do"):
                    mode = "while-do";
                    break;
                case ("do-while"):
                    mode = "do-while";
                    break;
            }
        }

        if (mode == null) {
            System.out.println(
                    "You may specify 'for', 'while-do' or 'do-while' on the command-line to specify a different loop."
            );
            mode = "for";
        }

        switch (mode) {
            case ("for"):  // Using a for loop
                System.out.println("Using for loop..");
                for (i = 0; i <= 100; i += 1) {
                    if ((i % 7) != 0) {
                        total += i;
                    }
                }

                break;
            case ("while-do"):  // Using a while loop
                System.out.println("Using while loop..");
                i = 0;

                while (i <= 100) {
                    if ((i % 7) != 0) {
                        total += i;
                    }

                    i += 1;
                }
                break;
            case ("do-while"):  // Using a do-while loop
                System.out.println("Using do-while loop..");
                i = 0;

                do {
                    if ((i % 7) != 0) {
                        total += i;
                    }

                    i += 1;
                } while (i <= 100);
                break;
        }

        average = total / 100F;

        System.out.println(String.format("Sum: %s", total));
        System.out.println(String.format("Average: %s", average));
    }
}

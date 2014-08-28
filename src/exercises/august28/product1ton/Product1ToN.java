package exercises.august28.product1ton;

public class Product1ToN {

    public static void main(String[] args) {

        long total = 1;
        long product = 10;
        int i;

        if (args.length == 0) {
            System.out.println("Using 10 as the product.");
        } else {
            try {
                product = Long.parseLong(args[0]);
            } catch (NumberFormatException e) {
                System.out.println(String.format("%s is not a valid product!", args[0]));
                return;
            }

            if (product < 1) {
                System.out.println("Product must be greater than 1!");
                return;
            }

            System.out.println(String.format("Using %s as the product.", product));
        }

        for (i = 1; i <= product; i += 1) {
            total = total * i;
        }

        System.out.println(String.format("Product: %s", total));
    }
}

package Basic;
public class ForLoop {
    public static void main(String[] args) {
        /* Java For Loop */

        /*
         * for (int i = 0; i < 5; i++) {
         * System.out.println(i);
         * }
         */

        /*
         * for (int i = 0; i <= 10; i = i + 2) {
         * System.out.println(i);
         * }
         */

        /* Nested Loops */

        /*
         * // Outer loop
         * for (int i = 1; i <= 2; i++) {
         * System.out.println("Outer: " + i); // Executes 2 times
         *
         * // Inner loop
         * for (int j = 1; j <= 3; j++) {
         * System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
         * }
         * }
         */

        /* For-Each Loop */

        /*
         * String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
         * for (String i : cars) {
         * System.out.println(i);
         * }
         */

        /* Real-Life Examples */

        /*
         * for (int i = 0; i <= 100; i += 10) {
         * System.out.println(i);
         * }
         */

        /*
         * for (int i = 0; i <= 10; i = i + 2) {
         * System.out.println(i);
         * }
         */

        int number = 2;

        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
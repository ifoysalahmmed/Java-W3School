package Basic;
public class WhileLoop {
    public static void main(String[] args) {
        /* Java While Loop */

        /*
         * int i = 0;
         * while (i < 5) {
         * System.out.println(i);
         * i++;
         * }
         */

        /* Java Do/While Loop */

        /*
         * int i = 0;
         * do {
         * System.out.println(i);
         * i++;
         * } while (i < 5);
         */

        /* Real-Life Examples */

        /*
         * int countdown = 3;
         *
         * while (countdown > 0) {
         * System.out.println(countdown);
         * countdown--;
         * }
         *
         * System.out.println("Happy New Year!!");
         */

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
    }
}

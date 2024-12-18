package Basic;
public class Break_Continue {
    public static void main(String[] args) {
        /* Java Break */

        /*
         * for (int i = 0; i < 10; i++) {
         * if (i == 4) {
         * break;
         * }
         * System.out.println(i);
         * }
         */

        /* Java Continue */

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        /* Break and Continue in While Loop */

        // Break Example

        int i = 0;
        /*
         * while (i < 10) {
         * System.out.println(i);
         * i++;
         * if (i == 4) {
         * break;
         * }
         * }
         */
        // Continue Example

        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}

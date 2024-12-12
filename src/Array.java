public class Array {
    public static void main(String[] args) {
        /* Java Arrays */

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        cars[0] = "Opel";

        // System.out.println(cars[0]);

        // System.out.println(cars.length);

        /* Loop Through an Array */

        // for (int i = 0; i < cars.length; i++) {
        // System.out.println(cars[i]);
        // }

        /* Loop Through an Array with For-Each */

        // for (String c : cars) {
        // System.out.println(c);
        // }

        /* Real-Life Example */

        /* average of different ages: */
        // int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };
        // float avg, sum = 0;
        // int length = ages.length;

        // for (int age : ages) {
        // sum += age;
        // }

        // avg = sum / length;

        // System.out.println("The average age is: " + avg);

        /* lowest age among different ages */
        // int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };
        // int lowestAge = ages[0];

        // for (int age : ages) {
        //     if (lowestAge > age) {
        //         lowestAge = age;
        //     }
        // }

        // System.out.println("The lowest age in the array is: " + lowestAge);
    }
}

package Basic;
public class Condition {
    public static void main(String[] args) {
        /* The if Statement */

        /*
         * if (20 > 18) {
         * System.out.println("20 is greater than 18");
         * }
         */

        /*
         * int x = 20;
         * int y = 18;
         * if (x > y) {
         * System.out.println("x is greater than y");
         * }
         */

        /* The else Statement */

        /*
         * int time = 20;
         * if (time < 18) {
         * System.out.println("Good day.");
         * } else {
         * System.out.println("Good evening.");
         * }
         */

        /* The else if Statement */

        /*
         * int time = 22;
         * if (time < 10) {
         * System.out.println("Good morning.");
         * } else if (time < 18) {
         * System.out.println("Good day.");
         * } else {
         * System.out.println("Good evening.");
         * }
         */

        /* Short Hand if...else */

        /*
         * int time = 20;
         * String result = (time < 18) ? "Good day." : "Good evening.";
         * System.out.println(result);
         */

        /* Real-Life Examples */

        /*
         * int doorCode = 1337;
         *
         * if (doorCode == 1337) {
         * System.out.println("Correct code. The door is now open.");
         * } else {
         * System.out.println("Wrong code. The door remains closed.");
         * }
         */

        /*
         * int myNum = 10; // Is this a positive or negative number?
         *
         * if (myNum > 0) {
         * System.out.println("The value is a positive number.");
         * } else if (myNum < 0) {
         * System.out.println("The value is a negative number.");
         * } else {
         * System.out.println("The value is 0.");
         * }
         */

        int myNum = 5;

        if (myNum % 2 == 0) {
            System.out.println(myNum + " is even");
        } else {
            System.out.println(myNum + " is odd");
        }
    }
}

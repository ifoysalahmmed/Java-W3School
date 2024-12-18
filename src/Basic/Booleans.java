package Basic;
public class Booleans {

    public static void main(String[] args) {
        /* Boolean Values */

        /*
         * boolean isJavaFun = true;
         * boolean isFishTasty = false;
         * System.out.println(isJavaFun);
         * System.out.println(isFishTasty);
         */

        /* Boolean Expression */

        /*
         * int x = 10;
         * int y = 9;
         * System.out.println(x > y);
         */

        /* Real Life Example */

        /*
         * int myAge = 25;
         * int votingAge = 18;
         * System.out.println(myAge >= votingAge);
         */

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
package Methods;
public class MethodOverloading {
    /* Method Overloading */

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodouble(4.3, 6.26);

        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}

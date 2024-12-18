package Methods;
public class MethodParams {
    /* Parameters and Arguments */

    // static void myMethod(String fname) {
    // System.out.println(fname + " Refsnes");
    // }

    /* Multiple Parameters */

    // static void myMethod(String fname, int age) {
    // System.out.println(fname + " is " + age + " years old.");
    // }

    /* A Method with If...Else */

    // static void checkAge(int age) {
    // if (age < 18) {
    // System.out.println("Access denied - You are not old enough!");
    // } else {
    // System.out.println("Access granted - You are old enough!");
    // }
    // }

    /* Return Values */

    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // System.out.println(myMethod(5, 10));

        int z = myMethod(5, 10);

        System.out.println(z);
    }
}

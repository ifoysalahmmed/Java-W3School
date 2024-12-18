package Basic;
public class DataTypes {
    public static void main(String[] args) {
        byte myNum = 100;
        System.out.println(myNum);

        short myNum2 = 5000;
        System.out.println(myNum2);

        int myNum3 = 100000;
        System.out.println(myNum3);

        long myNum4 = 15000000000L;
        System.out.println(myNum4);

        float myNum5 = 5.75f;
        System.out.println(myNum5);

        double myNum6 = 19.99d;
        System.out.println(myNum6);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // Outputs true
        System.out.println(isFishTasty); // Outputs false

        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // real-life example
        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
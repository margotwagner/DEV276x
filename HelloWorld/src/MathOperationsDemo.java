/*
    Created by Margot Wagner 02/18/2020
 */

public class MathOperationsDemo {
    public static void main(String[] args) {
        //int x = 10;
        double x = 10;
        //int y = 5;
        int y = 3;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));

        x++;
        y *= 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

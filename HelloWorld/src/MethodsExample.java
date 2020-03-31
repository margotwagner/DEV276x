/*
    Created by Margot Wagner 02/18/2020
 */

public class MethodsExample {
    public static void main(String[] args)  {
        message1();
        message2();
    }

    public static void message1()   {
        System.out.println("This is message 1.");
    }

    public static void message2()   {
        System.out.println("This is message 2");
        message1();

        System.out.println("Done with message2.");
    }
}

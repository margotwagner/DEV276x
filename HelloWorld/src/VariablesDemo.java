public class VariablesDemo {
    public static void main(String[] args)  {
        int x = 10;
        System.out.println("My variable x contains " + x);

        x = 15;     // leave out data type since this variable already exists
        System.out.println("My variable x contains " + x);

        String myString = "My variable x contains ";
        System.out.println(myString + x);
    }
/*
    public static void myMethod()   {
        System.out.println(myString + x);
    }

 */
}

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("result = " + fibonacci(6));
    }

    public static int fibonacci(int n)  {
        if (n == 1) { return 1; }
        else if (n == 2) {return 1;}
        else {
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }
}

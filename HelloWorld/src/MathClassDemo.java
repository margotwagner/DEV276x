/*
Created by Margot Wagner on 2/28/2020
 */
public class MathClassDemo {
    public static void main(String[] args)  {
        // pythagorean theorem c = square root of (a^2 + b^2)
        int a = 5;
        int b = 10;
        double aSq = Math.pow(a, 2); // Math.pow(base, exp) returns a double
        double bSq = Math.pow(b, 2);
        double c = Math.sqrt(aSq + bSq);
        System.out.println("c = " + c);

        double ans = 7-2+Math.log10(1000) + Math.log(Math.pow(Math.E,5));
        System.out.println(ans);

        double grade = 2.7;
        Math.round(grade);


    }
}

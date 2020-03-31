import java.util.Scanner;
public class LearnScanner {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("How much do you weight (in lbs)?");
        double weight = input.nextDouble();
        System.out.println("You are " + age + " years old and weight " + weight + " lbs.");

        System.out.print("On what day of the month were you born?");
        int day = input.nextInt();
        System.out.print("What is the name of the month in which you were born?");
        String month = input.next();
        System.out.print("During what year were you born?");
        int year = input.nextInt();
        System.out.println("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");

    }


}

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your grade? ");
        int grade = input.nextInt();

        if (grade > 80) {
            System.out.println("Admitted!");
        } else if (grade > 60)  {
            System.out.println("Waitlisted.");
        } else {
            System.out.println("Rejected.");
        }
    }
}

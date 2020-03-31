/*
Created by Margot 2/26/2020
 */

import java.util.Scanner;
import java.util.Random;

public class OddsAndEvens {
    public static void main(String[] args)  {
        System.out.println("Let's play a game called \"Odds and Evens\"");
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens ");
        String userOESelection = input.nextLine();

        if (userOESelection.equals("O"))  {
            System.out.println(name + " has picks odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picks evens! The computer will be odds.");
        }

        System.out.println("-----------------------------------");

        System.out.print("How many \"fingers\" do you put out? ");
        int userFingers = input.nextInt();

        Random rand = new Random();
        int computerFingers = rand.nextInt(6);

        System.out.println("The computer plays " + computerFingers + " \"fingers\".");
        System.out.println("-----------------------------------");

        int sumFingers = userFingers + computerFingers;
        System.out.println(userFingers + " + " + computerFingers + " = " + sumFingers);

        boolean oddOrEven = sumFingers % 2 == 0;

        if (oddOrEven) {
            System.out.println(sumFingers + " is ...even!");
            if (userOESelection.equals("E")) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("That means the computer wins! :(");
            }
        } else {
            System.out.println(sumFingers + " is ...odd!");
            if (userOESelection.equals("O")) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("That means the computer wins! :(");
            }
        }
        System.out.println("-----------------------------------");
    }
}

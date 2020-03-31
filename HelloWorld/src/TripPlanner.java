import javax.swing.*;
import java.util.Scanner;
//import java.util.Math.abs;

public class TripPlanner {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        greeting(input);
        travelTimeAndBudget(input);
        timeDifference(input);
        countryArea(input);
    }

    public static void greeting(Scanner input)  {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String destination = input.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip.");
        System.out.println("***************");
    }

    public static void travelTimeAndBudget(Scanner input)  {
        System.out.print("How many days are you going to spend travelling? ");
        int tripLengthDays = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double budget = input.nextDouble();
        input.nextLine();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.nextLine();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double currencyConversion = input.nextDouble();
        System.out.println("");
        int tripLengthHours = tripLengthDays*24;
        int tripLengthMinutes = tripLengthHours*60;
        System.out.println("If you are travelling for " + tripLengthDays + " days, that is the same as "
                + tripLengthHours + " hours or " + tripLengthMinutes + " minutes");
        double dailyBudget = budget/tripLengthDays;
        System.out.println("If you are going to spend $" + String.format("%.2f",budget)
                + " USD, that means per day you can spend up to $" +  String.format("%.2f", dailyBudget) + " USD");
        double foreignBudget = currencyConversion*budget;
        double foreignBudgetDaily = foreignBudget/tripLengthDays;
        System.out.println("Your total budget in " + currency + " is " + String.format("%.2f", foreignBudget) + " " + currency +
                ", which per day is " + String.format("%.2f", foreignBudgetDaily) + " " + currency);
        System.out.println("***************");

    }

    public static void timeDifference(Scanner input) {
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDifference = input.nextInt();

        System.out.println("That means that when it is midnight at home, it will be "
                + (timeDifference%24) + ":00 in your travel destination and when it is noon at home it will be "
                + ((timeDifference+12)%24) + ":00");
        System.out.println("***************");



        //System.out.println("That means that when it is midnight at home, it will be __ in your travel destination");
    }

    public static void countryArea(Scanner input)   {
        System.out.print("What is the square area of your destination country in km2? ");
        double areakm2 = input.nextDouble();
        System.out.println("In miles2 that is " + String.format("%.1f", areakm2/Math.pow(1.6,2)));
        System.out.println("***************");
    }

    public static void haversineDistance(Scanner input) {
        System.out.print("What is the latitude of your home? ");
        double latHome = input.nextDouble();
        System.out.print("What is the longitude of your home? ");
        double longHome = input.nextDouble();
        System.out.print("What is the latitude of your destination? ");
        double latDest = input.nextDouble();
        System.out.print("What is the longitude of your destination? ");
        double longDest = input.nextDouble();
    }
}

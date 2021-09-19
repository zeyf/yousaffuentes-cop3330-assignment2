package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 zain yousaffuentes
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        boolean validInput = false;

        while (!validInput) {

            try {
                System.out.println("What is the rate of return? ");

                int monthsToDoubleInitialInvestment = calculateYearsToDoubleInvestment(s.nextInt());

                System.out.println(createInvestmentMessage(monthsToDoubleInitialInvestment));

                validInput = true;

            } catch (InputMismatchException ex) {
                System.out.println("Sorry. That's not a valid input.");
                s.next();
            };

        };

    };

    public static int calculateYearsToDoubleInvestment(int rateofreturn) {
        return 72 / rateofreturn;
    };

    public static String createInvestmentMessage(int rate) {
        return String.format("It will take %d years to double your initial investment.", rate);
    };

}

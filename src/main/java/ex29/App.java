package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        boolean validInput = false;

        // loops and catches invalid input until valid input is entered.
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

    // calculates the years to double the investment and returns the years
    public static int calculateYearsToDoubleInvestment(int rateofreturn) {
        return 72 / rateofreturn;
    };

    // returns a formatted string with the number of years it will take to double the initial investment
    public static String createInvestmentMessage(int years) {
        return String.format("It will take %d years to double your initial investment.", years);
    };

}

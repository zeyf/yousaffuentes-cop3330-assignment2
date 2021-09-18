package ex26;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        Hashtable<String, Double> data = getData();
        PaymentCalculator calculator = new PaymentCalculator();

        int numberOfMonthsToPayOff = calculator.calculateMonthsUntilPaidOff(data.get("dailyrate"), data.get("balance"), data.get("monthlypayment"));
        System.out.println(createPaymentMessage(numberOfMonthsToPayOff));

    };


    public static Hashtable<String, Double> getData() {
        Scanner s = new Scanner(System.in);

        Hashtable<String, Double> data = new Hashtable<String, Double>();

        System.out.println("What is your balance? ");
        double balance = s.nextDouble();
        data.put("balance", balance);
        System.out.println("What is the APR on the card (as a percent)? ");
        double dailyrate = s.nextDouble() / 100 / 365;
        data.put("dailyrate", dailyrate);
        System.out.println("What is the monthly payment you can make? ");
        double monthlypayment = s.nextDouble();
        data.put("monthlypayment", monthlypayment);

        return data;

    };

    public static String createPaymentMessage(int months) {
        return String.format("It will take you %d months to pay off this card.", months);
    };

}

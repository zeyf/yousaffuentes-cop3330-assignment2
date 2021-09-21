package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 zain yousaffuentes
 */



import java.lang.Math;

public class PaymentCalculator {

    // calculates the months left until the balance on the credit car dbased on the balance, monthly payment, and the apr daily rate over a year
    public int calculateMonthsUntilPaidOff(double i, double b, double p) {

        double x = -(1.0/30) * Math.log(1 + b/p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i);

        return (int) Math.floor(x) + 1;
    };

}

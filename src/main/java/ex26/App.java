package ex26;

import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("What is your balance? ");
        double balance = s.nextDouble();
        System.out.println("What is the APR on the card (as a percent)? ");
        double dailyrate = ((double) s.nextDouble()) / 100 / 365;
        System.out.println("What is the monthly payment you can make? ");
        int monthlypayment = s.nextInt();

        PaymentCalculator calculator = new PaymentCalculator();

        System.out.println(String.format("It will take you %d months to pay off this card.", calculator.calculateMonthsUntilPaidOff(dailyrate, balance, monthlypayment)));

    };

}

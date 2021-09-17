package ex31;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {

            try {

                System.out.print("Please enter your age: ");
                int age = s.nextInt();
                System.out.print("Please enter your resting heart rate");
                int restingHeartRate = s.nextInt();

                System.out.print(
                        String.format("Resting Pulse: %d\tAge: %d\n\nIntensity    | Rate   \n-------------|--------\n", restingHeartRate, age)
                );

                double cIntensity = 55;

                while (cIntensity <= 95) {

                    double cTestingHeartRate = (((220 - age) - restingHeartRate) * (cIntensity / 100)) + restingHeartRate;

                    System.out.println(String.format(
                            "%.0f%%          | %.0f bpm",
                            cIntensity,
                            cTestingHeartRate
                    ));

                    cIntensity += 5;
                };

                validInput = true;

            } catch(InputMismatchException ex) {

                System.out.println("Please enter numbers.");
                s.next();

            };

        }

    };






}

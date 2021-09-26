package ex31;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean validInput = false;

        // take in input while invalid until valid
        while (!validInput) {

            try {

                System.out.print("Please enter your age: ");
                int age = s.nextInt();
                System.out.print("Please enter your resting heart rate: ");
                int restingHeartRate = s.nextInt();

                printTable(age, restingHeartRate);

                validInput = true;

            } catch(InputMismatchException ex) {

                System.out.println("Please enter numbers.");
                s.next();

            };

        }

    };


    // calculates the testing heart rate based on the age, restingheartrate and the current intensity
    public static int calculateTestingHeartRate(int age, int restingHeartRate, double cIntensity) {
        return (int) Math.floor((((220 - age) - restingHeartRate) * (cIntensity / 100)) + restingHeartRate) + 1;
    };

    // prints the table from the cintensity from 55 to 95
    public static void printTable(int age, int restingHeartRate) {

        System.out.print(
                String.format("Resting Pulse: %d\tAge: %d\n\nIntensity    | Rate   \n-------------|--------\n", restingHeartRate, age)
        );

        double cIntensity = 55;

        while (cIntensity <= 95) {

            int cTestingHeartRate = calculateTestingHeartRate(age, restingHeartRate, cIntensity);

            System.out.println(String.format(
                    "%.0f%%          | %d bpm",
                    cIntensity,
                    cTestingHeartRate
            ));

            cIntensity += 5;
        };
    };







}

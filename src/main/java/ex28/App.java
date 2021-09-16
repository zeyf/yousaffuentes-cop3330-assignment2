package ex28;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 zain yousaffuentes
 */


public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        int sum = 0;

        for (int x = 0; x < 5; x++) {

            System.out.println("Enter a number: ");
            sum += s.nextInt();

        };

        System.out.println(
                String.format(
                        "The total is %d.",
                        sum
                )
        );

    };




}

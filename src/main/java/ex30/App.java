package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        for (int x = 1; x <= 12; x++) {
            for (int y = 1; y <= 12; y++)
                System.out.print(String.format("    %d", x * y));
            System.out.println("\n");
        };
    };


}

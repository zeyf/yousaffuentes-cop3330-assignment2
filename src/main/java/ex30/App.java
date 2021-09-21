package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        // prints the multiplication table from 1 to 12 up to 12
        for (int x = 1; x <= 12; x++) {
            for (int y = 1; y <= 12; y++)
                System.out.print(createProductString(calculateProduct(x, y)));
            System.out.print("\n");
        };
    };

    // calculates the product of two numbers
    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    };

    // creates the formatted string with proper width spacing for each product
    public static String createProductString(int product) {
        return String.format("%5d", product);
    };

}

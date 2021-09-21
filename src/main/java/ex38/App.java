package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");

        // takes in and split the string by a delimiter of " "
        String [] splitNumChars = s.nextLine().split(" ");

        int []nums = new int[splitNumChars.length];

        // parseInts the split string array values into an integer array
        for (int x = 0; x < nums.length; x++)
            nums[x] = Integer.parseInt(splitNumChars[x]);

        int []filteredEvens = filterEvenNumbers(nums);

        printEvenNumbers(filteredEvens);

    };

    // filters the even numbers out by counting the number of even numbers and fills a new array with
    // even numbers and then returns the filtered integer array of only even numbers
    public static int[] filterEvenNumbers(int[] initial) {

        int evencount = 0;

        for (int x = 0; x < initial.length; x++)
            if (initial[x] % 2 == 0)
                evencount++;

        int[] filtered = new int[evencount];

        for (int x = 0, k = 0; x < initial.length; x++)
            if (initial[x] % 2 == 0)
                filtered[k++] = initial[x];

        return filtered;

    };

    //print the list of the even numbers
    private static void printEvenNumbers(int []filteredEvens) {

        System.out.print("The even numbers are");

        for (int x = 0; x < filteredEvens.length; x++) {
            System.out.print(String.format(" %d", filteredEvens[x]));
            if (x == filteredEvens.length - 1)
                System.out.print(".");
        };

    };


}
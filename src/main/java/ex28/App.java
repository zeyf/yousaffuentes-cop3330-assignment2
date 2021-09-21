package ex28;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 zain yousaffuentes
 */


public class App {

    public static void main (String[] args) {

        int [] nums = collectNumbers();
        System.out.println(calculateSum(nums));

    };

    // collects the 5 numbers entered and returns them
    public static int[] collectNumbers() {

        Scanner s = new Scanner(System.in);
        int[] nums = new int[5];

        for (int x = 0; x < nums.length; x++) {
            System.out.print("Enter a number: ");
            nums[x] = s.nextInt();
        };

        return nums;

    };

    // calculates the sum of the numbers and returns a formated stirng of the total/sum
    public static String calculateSum(int [] nums) {

        int sum = 0;

        for (int x = 0; x < nums.length; x++)
            sum += nums[x];

        return createSumMessage(sum);

    };

    private static String createSumMessage(int sum) {
        return String.format("The total is %d.", sum);
    };


}

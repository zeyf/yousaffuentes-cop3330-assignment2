package ex36;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {

            System.out.print("Enter a number: ");
            String line = s.nextLine();

            if (line.equals("done"))
                break;
            else {
                boolean isIntegerFlag = true;

                char [] lineSplit = line.toCharArray();

                for (int x = 0; x < lineSplit.length && isIntegerFlag; x++) {
                    if (!Character.isDigit(lineSplit[x]))
                        isIntegerFlag = false;
                };

                if (!isIntegerFlag)
                    continue;
            }

            list.add(Integer.parseInt(line));

        };

        printNumbers(list);

        System.out.print(createStatisticMetricsMessage(average(list), min(list), max(list), std(list)));

    };

    public static int min(ArrayList<Integer> list) {

        int min = list.get(0);

        for (int x = 1; x < list.size(); x++)
            if (list.get(x) < min)
                min = list.get(x);

        return min;

    };

    public static int max(ArrayList<Integer> list) {

        int max = list.get(0);

        for (int x = 1; x < list.size(); x++)
            if (list.get(x) > max)
                max = list.get(x);

        return max;

    };

    public static double average(ArrayList<Integer> list) {

        double sum = 0.0;

        for (int x = 0; x < list.size(); x++)
            sum += list.get(x);

        return sum / list.size();

    };

    public static double std(ArrayList<Integer> list) {

        double stdev = 0.0, mean = average(list);

        for (double n: list) {
            stdev += Math.pow(n - mean, 2);
        };

        return Math.sqrt(stdev / list.size());

    };

    public static void printNumbers(ArrayList<Integer> list) {

        System.out.print("Numbers:");

        for (int x = 0; x < list.size(); x++) {
            System.out.print(String.format(" %d", list.get(x)));
            if (x != list.size() - 1)
                System.out.print(",");
            else
                System.out.print("\n");
        };

    };

    public static String createStatisticMetricsMessage(double avg, int min, int max, double std) {
        return String.format("The average is %.1f\nThe minimum is %d\nThe maximum is %d\nThe standard deviation is %.2f", avg, min, max, std);
    };

}

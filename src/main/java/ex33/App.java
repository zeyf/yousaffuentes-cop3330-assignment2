package ex33;

import java.util.Scanner;
import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        Random r = new Random();
        int randomIndex = r.nextInt(3);
        System.out.print("What's your question?\n> ");

        Scanner s = new Scanner(System.in);
        String question = s.nextLine();

        System.out.println(pickRandomTemplate(randomIndex));

    };

    public static String pickRandomTemplate(int randomIndex) {
        String [] templates = { "Yes", "No", "Ask again later." };
        return templates[randomIndex];

    };

}

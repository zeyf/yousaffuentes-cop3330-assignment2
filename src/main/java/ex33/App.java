package ex33;

import java.util.Scanner;
import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(3);
        String [] templates = { "Yes", "No", "Ask again later." };

        System.out.print("What's your question?\n> ");
        String question = s.nextLine();

        System.out.println(String.format("%s", templates[randomNumber]));

    };

}

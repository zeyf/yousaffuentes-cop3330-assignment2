package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main (String [] args) {

        ArrayList<String> list = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        // keep looping until no name is entered
        do {

            System.out.print("Enter a name: ");
            String name = s.nextLine();

            if (checkNameExistence(name))
                list.add(name);
            else
                break;

        } while(true);

        int randomIndex = r.nextInt(list.size());

        System.out.print(createWinnerMessage(list, randomIndex));

    };

    // formats a string about who the randomly selected winner is based on the randomIndex
    public static String createWinnerMessage(ArrayList<String> list, int randomIndex) {
        return String.format("The winner is... %s.", list.get(randomIndex));
    };

    // checks if a name exists, aka is or is not "" and returns a boolean
    public static boolean checkNameExistence(String name) {
        return !name.equals("");
    };

}

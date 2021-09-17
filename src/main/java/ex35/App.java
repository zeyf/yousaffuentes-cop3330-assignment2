package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
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

        do {

            System.out.print("Enter a name: ");
            String name = s.nextLine();

            if (!name.equals(""))
                list.add(name);
            else
                break;

        } while(true);

        int randomIndex = r.nextInt(list.size());

        System.out.print(String.format("The winner is... %s.", list.get(randomIndex)));

    };

}

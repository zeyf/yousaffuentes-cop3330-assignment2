package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solution
 *  Copyright 2021 zain yousaffuentes
 */


import java.util.Scanner;
import java.util.Random;

public class App {


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        Random r = new Random();

        char [] specialchars = { '!', '@', '#', '$', '%', '^', '&', '*' };
        char [] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        char [] letters = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        System.out.print("What's the minimum length? ");
        int minlength = s.nextInt();
        System.out.print("How many special characters? ");
        int specialcharacterscount = s.nextInt();
        System.out.print("How many numbers? ");
        int numberscount = s.nextInt();

        char [] password = new char[minlength];

        for (int x = 0; x < minlength; x++)
            password[x] = letters[r.nextInt(letters.length)];

        for (int x = 0; x < numberscount; x++) {

            int randomIndex = r.nextInt(minlength);

            if (Character.isDigit(password[randomIndex]))
                while (Character.isDigit(password[randomIndex]))
                    randomIndex = r.nextInt(minlength);

            password[randomIndex] = digits[r.nextInt(digits.length)];

        };

        for (int x = 0; x < specialcharacterscount; x++) {
            int randomIndex = r.nextInt(minlength);

            if (Character.isDigit(password[randomIndex]))
                while (Character.isDigit(password[randomIndex]) && !Character.isLetterOrDigit(password[randomIndex]))
                    randomIndex = r.nextInt(minlength);

            password[randomIndex] = specialchars[r.nextInt(specialchars.length)];

        };

        System.out.print(String.format("The new password is %s", String.valueOf(password)));

    };

}
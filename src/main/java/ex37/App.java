package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solution
 *  Copyright 2021 zain yousaffuentes
 */

// left to do: Use lists to store the characters you’ll use to generate the passwords instead of ascii ranges

import java.util.Scanner;
import java.util.Random;

public class App {


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.print("What's the minimum length? ");
        int minlength = s.nextInt();
        System.out.print("How many special characters? ");
        int specialcharacters = s.nextInt();
        System.out.print("How many numbers? ");
        int numbers = s.nextInt();

        char [] password = new char[minlength];

        for (int x = 0; x < minlength; x++) {
            char randomCharacter = (char) (r.nextInt(122 - 97 + 1) + 97);
            password[x] = randomCharacter;
        };

        for (int x = 0; x < numbers; x++) {
            password[r.nextInt(minlength)] = (char) (r.nextInt(57 - 48 + 1) + 48);
        };

        for (int x = 0; x < specialcharacters; x++) {
            int randomIndex = r.nextInt(minlength);
            char randomSpecial = (char) (r.nextInt(47 - 33 + 1) + 33);
            if (!Character.isDigit(password[randomIndex])) {
                password[x] = randomSpecial;
            } else {
                while (Character.isDigit(password[randomIndex]))
                    randomIndex = r.nextInt(minlength);
                password[randomIndex] = randomSpecial;
            };
        };

        System.out.print(String.format("The new password is %s", String.valueOf(password)));

    }


}

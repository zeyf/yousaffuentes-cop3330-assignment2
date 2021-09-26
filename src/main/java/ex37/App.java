package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */


import java.util.Scanner;
import java.util.Random;

public class App {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // preknown digits, letters, and special characters to choose from for randomization
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

        fillWithLetters(password, letters);
        integrateRandomNumbers(password, digits, numberscount);
        integrateRandomSpecialCharacters(password, specialchars, specialcharacterscount);

        System.out.print(createFinalPasswordMessage(password));

    };

    // fills a character array of n size with RANDOMIZED letters
    public static void fillWithLetters (char []emptyPassword, char []letters) {

        Random r = new Random();

        for (int x = 0; x < emptyPassword.length; x++)
            emptyPassword[x] = letters[r.nextInt(letters.length)];

    };

    /*
    * integrates n RANDOM digit characters into the filled base letter char array.
    * */
    public static void integrateRandomNumbers(char []password, char[]digits, int numbersToAddCount) {

        Random r = new Random();

        for (int x = 0; x < numbersToAddCount; x++) {

            int randomIndex = r.nextInt(password.length);

            if (Character.isDigit(password[randomIndex]))
                while (Character.isDigit(password[randomIndex]))
                    randomIndex = r.nextInt(password.length);

            password[randomIndex] = digits[r.nextInt(digits.length)];

        };

    };

    /*
     * integrates n RANDOM special characters into the filled base letter and/or random number integrated char array
     * */
    public static void integrateRandomSpecialCharacters(char []password, char []specialCharacters, int specialCharactersToAddCount) {

        Random r = new Random();

        for (int x = 0; x < specialCharactersToAddCount; x++) {
            int randomIndex = r.nextInt(password.length);
            if (Character.isDigit(password[randomIndex]) || !Character.isLetterOrDigit(password[randomIndex]))
                while (Character.isDigit(password[randomIndex]) || !Character.isLetterOrDigit(password[randomIndex]))
                    randomIndex = r.nextInt(password.length);

            password[randomIndex] = specialCharacters[r.nextInt(specialCharacters.length)];

        };

    };

    // creates and returns a formatted string of the randomized password
    public static String createFinalPasswordMessage(char []password) {
        return String.format("The new password is %s", String.valueOf(password));
    }

}
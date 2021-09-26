package ex25;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        String password = getPassword();
        int passwordStrength = passwordValidator(password);
        System.out.print(createPasswordStrengthMessage(passwordStrength, password));

    };

    /* takes in a string of the password, splits it into a character array, counts the digits, letters, and special characters
        and returns a value that will be used to select a template based on the passwords strength and attributes
     */
    public static int passwordValidator(String password) {

        char[] splitPassword = password.toCharArray();

        int digitCount = 0, letterCount = 0, specialCount = 0;

        for (int x = 0; x < splitPassword.length; x++) {

            boolean letterStatus = Character.isLetter(splitPassword[x]),
                    numberStatus = Character.isDigit(splitPassword[x]);

            if (letterStatus && !numberStatus)
                letterCount++;
            else if (!letterStatus && numberStatus)
                digitCount++;
            else
                specialCount++;

        };

        if (digitCount == password.length() && password.length() < 8)
            return 0;
        else if (letterCount == password.length() && password.length() < 8)
            return 1;
        else if (letterCount > 0 &&  digitCount > 0 && specialCount > 0 && password.length() >= 8)
            return 3;
        else if (letterCount > 0 && digitCount > 0 && password.length() >= 8)
            return 2;

        return 0;

    };

    // rad sin the password and returns it
    public static String getPassword() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the password: ");

        return s.nextLine();

    };

    // returns a formatted string to print the password and its strength based on a passwords strength
    public static String createPasswordStrengthMessage(int strength, String password) {

        String [] templates = {
                "The password '%s' is a very weak password.",
                "The password '%s' is a weak password.",
                "The password '%s' is a strong password.",
                "The password '%s' is a very strong password."
        };

        return String.format(templates[strength], password);

    };

}

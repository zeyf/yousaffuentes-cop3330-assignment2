package ex24;

import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        String password = s.nextLine();

        int passwordStrength = passwordValidator(password);

        String [] templates = new String[4];

        templates[0] = "The password '%s' is a very weak password.";
        templates[1] = "The password '%s' is a weak password.";
        templates[2] = "The password '%s' is a strong password.";
        templates[3] = "The password '%s' is a very strong password.";

        System.out.println(String.format(templates[passwordStrength], password));
    };

    private static int passwordValidator(String password) {

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

}

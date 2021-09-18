package ex27;

import java.util.Hashtable;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 27 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String[] args) {

        Hashtable<String, String> data = getData();
        String validationStatusMessage = validateInput(data.get("fname"), data.get("lname"), data.get("zipcode"), data.get("id"));
        System.out.print(validationStatusMessage);

    };

    public static Hashtable<String, String> getData() {
        Scanner s = new Scanner(System.in);
        Hashtable<String, String> data = new Hashtable<String, String>();

        System.out.print("Enter the first name ");
        data.put("fname", s.nextLine());
        System.out.print("Enter the last name ");
        data.put("lname", s.nextLine());
        System.out.print("Enter the ZIP code: ");
        data.put("zipcode", s.nextLine());
        System.out.print("Enter the employee ID: ");
        data.put("id", s.nextLine());

        return data;

    };

    public static String validateInput(String fname, String lname, String zipcode, String id) {

        boolean fnameLengthValidity = validateNameLength(fname),
                fnameExistenceValidity = validateNameExists(fname),
                lnameLengthValidity = validateNameLength(lname),
                lnameExistenceValidity = validateNameExists(lname),
                zipCodeValidity = validateZipCode(zipcode),
                idValidity = validateEmployeeID(id);

        String [] existenceTemplates = {
            "The first name must be filled in.\n",
            "The last name must be filled in.\n"
        };

        String [] invalidTemplates = {
                "The first name must be at least 2 characters long.\n",
                "The last name must be at least 2 characters long.\n",
                "The zipcode must be a 5 digit number.\n",
                "The employee id must have 2 leading letters, a hyphen, and 4 trailing numbers.\n"
        };

       String base = "";

        for (int x = 0; x < 4; x++) {
            if (x < 2) {
                if (x == 0) {
                    if (!fnameLengthValidity)
                        base += invalidTemplates[x];
                    if (!fnameExistenceValidity)
                        base += existenceTemplates[x];
                } else {
                    if (!lnameLengthValidity)
                        base += invalidTemplates[x];
                    if (!lnameExistenceValidity)
                        base += existenceTemplates[x];
                };
            } else {
                if (x == 2) {
                  if (!zipCodeValidity)
                      base += invalidTemplates[x];
                } else {
                    if (!idValidity)
                        base += invalidTemplates[x];
                };
            };
        };

        return createValidityMessage(base);

    };

    private static String createValidityMessage(String messageAggregator) {
        return messageAggregator.equals("") ? "There were no errors found." : messageAggregator;
    };

    public static boolean validateNameLength(String name) {
        // rules: must be filled in and more than two char long
        return name.length() >= 2;
    };

    public static boolean validateNameExists(String name) {
        return name.length() != 0 ? true: false;
    };

    public static boolean validateZipCode(String zipcode) {
        char[] splitZipCode = zipcode.toCharArray();

        int digitCount = 0;

        for (char c: splitZipCode) {

            if (Character.isDigit(c))
                digitCount++;
        };

        return digitCount == 5 && splitZipCode.length == 5 ? true : false;

    };

    public static boolean validateEmployeeID(String id) {

        if (id.length() > 7 || id.length() < 7) return false;

        char[] splitID = id.toCharArray();

        int initialLetterCount = 0;
        boolean hyphenPlacement = true;
        int trailingDigitCount = 0;

        for (int x = 0; x < splitID.length; x++) {
            if (x < 2) {
                if (Character.isLetter(splitID[x]))
                    initialLetterCount++;
            } else if (x == 2) {
                if (splitID[x] != '-')
                    hyphenPlacement = false;
            } else
                if (!Character.isDigit(splitID[x]))
                    break;
                else
                    trailingDigitCount++;
        };

        if (initialLetterCount != 2)
            return false;
        else if (!hyphenPlacement)
            return false;
        else if (trailingDigitCount != 4)
            return false;

        return true;

    };

};

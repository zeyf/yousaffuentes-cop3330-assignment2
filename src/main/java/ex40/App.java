package ex40;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 40 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Map<String, String>> employees = new ArrayList<Map<String, String>>();

        loadKnownEmployees(employees);
        sortEmployees(employees, "Last Name");

        System.out.print("Enter a search string: ");
        String substr = s.nextLine();

        printSubStringSearchFoundEmployees(employees, substr);

    };

    public static void printSubStringSearchFoundEmployees(ArrayList<Map<String, String>> employees, String substr) {

        System.out.print("Results: \n\n");

        System.out.print(String.format("%20s|%20s|%20s\n\n", "Name", "Position", "Separation Date"));

        for (int x = 0; x < employees.size(); x++) {

            boolean subStringCheckFirstName = subStringFind(employees.get(x).get("First Name"), substr),
                    subStringCheckLastName = subStringFind(employees.get(x).get("Last Name"), substr);

            if (subStringCheckFirstName || subStringCheckLastName)
                System.out.println(String.format("%20s|%20s|%20s", employees.get(x).get("First Name") + " " + employees.get(x).get("Last Name"), employees.get(x).get("Position"), employees.get(x).get("Separation Date")));

        };
    };

    public static boolean subStringFind(String string, String substr) {
        return string.indexOf(substr) != -1;
    };

    public static void sortEmployees(ArrayList<Map<String, String>> employees, String byKey) {
        employees.sort(Comparator.comparing(map-> map.get(byKey)));
    }

    public static void loadKnownEmployees(ArrayList<Map<String, String>> employees) {
        employees.add(Map.of(
                "First Name", "John",
                "Last Name", "Johnson",
                "Position", "Manager",
                "Separation Date", "2016-12-31"
        ));

        employees.add(Map.of(
                "First Name", "Tou",
                "Last Name", "Xiong",
                "Position", "Software Engineer",
                "Separation Date", "2016-10-05"
        ));

        employees.add(Map.of(
                "First Name", "Michaela",
                "Last Name", "Michaelson",
                "Position", "District Manager",
                "Separation Date", "2015-12-19"
        ));

        employees.add(Map.of(
                "First Name", "Jake",
                "Last Name", "Jacobson",
                "Position", "Programmer",
                "Separation Date", ""
        ));

        employees.add(Map.of(
                "First Name", "Jacquelyn",
                "Last Name", "Jackson",
                "Position", "DBA",
                "Separation Date", ""
        ));

        employees.add(Map.of(
                "First Name", "Sally",
                "Last Name", "Webber",
                "Position", "Web Developer",
                "Separation Date", "2015-12-18"
        ));
    };


};

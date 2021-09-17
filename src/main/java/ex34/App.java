package ex34;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String args[]) {

        Scanner s = new Scanner(System.in);

        String [] employees = { "John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin" };

        for (int x = 0; x < employees.length; x++) {
            if (x == 0)
                System.out.print(String.format("There are %d employees:\n%s\n", employees.length, employees[x]));
            else
                System.out.println(String.format("%s", employees[x]));
        };

        System.out.print("Enter an employee name to remove: ");
        String employeeToRemove = s.nextLine();

        String [] newEmployees = new String[employees.length - 1];

        System.out.println(String.format("There are %d employees:", newEmployees.length));

        for (int x = 0, y = 0; x < employees.length; x++) {

            if (employees[x].equals(employeeToRemove))
                continue;

            newEmployees[y] = employees[x];

            System.out.print(
                    x == 0 ? String.format("There are %d employees:\n%s\n", newEmployees.length, newEmployees[y++]) : String.format("%s\n", newEmployees[y++])
            );

        };



    };

}

package ex34;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */

public class App {

    public static void main (String args[]) {

        Scanner s = new Scanner(System.in);
        String [] employees = { "John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin" };

        System.out.print("Enter an employee name to remove: ");
        String employeeToRemove = s.nextLine();

        String [] filteredEmployeeArray = filterEmployee(employees, employeeToRemove);
        printEmployees(filteredEmployeeArray);

    };

    // prints the employees and the count
    public static void printEmployees(String[] employees) {

        for (int x = 0; x < employees.length; x++)
            if (x == 0)
                System.out.print(String.format("There are %d employees:\n%s\n", employees.length, employees[x]));
            else
                System.out.println(employees[x]);

    };

    // creates a new array and filters out an employee based on their name, returning an array of strings excluding the employee removed
    public static String[] filterEmployee(String[] employees, String employeeName) {

        String[] newEmployeeArray = new String[employees.length - 1];

        for (int x = 0, k = 0; x < employees.length; x++)
            if (!employees[x].equals(employeeName))
                newEmployeeArray[k++] = employees[x];
            else
                continue;

        return newEmployeeArray;

    };

}

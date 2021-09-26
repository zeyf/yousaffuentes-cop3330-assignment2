package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @Test
    public void filterEmployee() {

        String [] preFilteredEmployees = { "John", "Zain", "Michael", "Drake", "Lionel", "Cristiano" };
        String employeeToRemove1 = "Michael", employeeToRemove2 = "Drake";
        String [] postFilteredEmployeees1 = { "John", "Zain", "Drake", "Lionel", "Cristiano" }; // Michael is removed
        String [] postFilteredEmployeees2 = { "John", "Zain", "Michael", "Lionel", "Cristiano" }; // Drake is removed

        // true assertion
        assertArrayEquals(postFilteredEmployeees1, App.filterEmployee(preFilteredEmployees, employeeToRemove1));
        // true assertion 2
        assertArrayEquals(postFilteredEmployeees2, App.filterEmployee(preFilteredEmployees, employeeToRemove2));


    };
}
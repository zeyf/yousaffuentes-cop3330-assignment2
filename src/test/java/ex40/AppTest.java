package ex40;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void subStringFind() {

        String mainString = "HelloWorld!", subString = "oWorl";

        // true assertion
        assertEquals(true, App.subStringFind(mainString, subString));

    };

    @Test
    public void sortEmployees() {

        ArrayList<Map<String, String>> preSortedEmployees = new ArrayList<Map<String, String>>();

        preSortedEmployees.add(Map.of(
                "First Name", "Alex",
                "Last Name", "Johnson"
        ));
        preSortedEmployees.add(Map.of(
                "First Name", "Zain",
                "Last Name", "Yousaf Fuentes"
        ));

        ArrayList<Map<String, String>> unSortedEmployees = new ArrayList<Map<String, String>>();

        unSortedEmployees.add(Map.of(
                "First Name", "Zain",
                "Last Name", "Yousaf Fuentes"
        ));
        unSortedEmployees.add(Map.of(
                "First Name", "Alex",
                "Last Name", "Johnson"
        ));

        App.sortEmployees(unSortedEmployees, "Last Name");

        boolean sortedOrder = true;

        for (int x = 0; x < unSortedEmployees.size() && sortedOrder; x++)
            if (unSortedEmployees.get(x).get("Last Name") != preSortedEmployees.get(x).get("Last Name"))
                sortedOrder = false;

        // true assertion
        assertTrue(sortedOrder); // assert that the post sortEmployees function does what it claims to

    };
}
package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @Test
    public void calculateSum() {

        int [] testArray = { 1, 2, 3, 4, 5 };

        // true assertion
        assertEquals("The total is 15.", App.calculateSum(testArray));
        // false assertion
        assertNotEquals("The total is 42.", App.calculateSum(testArray));


    };
}
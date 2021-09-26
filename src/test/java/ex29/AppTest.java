package ex29;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


    @Test
    public void calculateYearsToDoubleInvestment() {

        // true assertion 1
        assertEquals(18, App.calculateYearsToDoubleInvestment(4));
        // true assertion 2
        assertEquals(9, App.calculateYearsToDoubleInvestment(8));
        // false assertion
        assertNotEquals(10, App.calculateYearsToDoubleInvestment(10));
    };

}
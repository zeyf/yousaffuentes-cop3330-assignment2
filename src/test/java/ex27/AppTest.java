package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void validateEmployeeID() {

        // true assertion
        assertTrue(App.validateEmployeeID("AA-1234"));
        // false assertion
        assertFalse(App.validateEmployeeID("AA-3"));

    };

    @Test
    public void validateNameExists() {

        // true assertion
        assertTrue(App.validateNameExists("john"));
        // false assertion
        assertFalse(App.validateNameExists(""));

    };

    @Test
    public void validateNameLength() {

        // true assertion
        assertTrue(App.validateNameLength("zain"));
        // false assertion
        assertFalse(App.validateNameLength("a"));

    };

    @Test
    public void validateZipCode() {

        // true assertion
        assertTrue(App.validateZipCode("33196"));
        // false assertion 1
        assertFalse(App.validateZipCode("33333333"));
        // false assertion 2
        assertFalse(App.validateZipCode("he24955k"));

    };

    @Test
    public void validateInput() {

        // true assertion
        assertEquals("There were no errors found.", App.validateInput("john", "johnson", "32259", "AA-4324"));
        // false assertion
        assertNotEquals("There were no errors found.", App.validateInput("", "j", "322jf31", "AA-4324"));

    };
}
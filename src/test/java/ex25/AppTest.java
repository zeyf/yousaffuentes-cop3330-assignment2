package ex25;



/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void passwordValidator() {


        String[] samplePasswords = {
                "12345",
                "hey",
                "heythere445",
                "hello12345%!"
        };

        // true assertion
        assertEquals(App.passwordValidator(samplePasswords[0]), 0);
        // true assertion
        assertEquals(App.passwordValidator(samplePasswords[1]), 1);
        // true assertion
        assertEquals(App.passwordValidator(samplePasswords[2]), 2);
        // true assertion
        assertEquals(App.passwordValidator(samplePasswords[3]), 3);

        // false assertion
        assertNotEquals(App.passwordValidator(samplePasswords[0]), 1);
        // false assertion
        assertNotEquals(App.passwordValidator(samplePasswords[1]), 3);
        // false assertion
        assertNotEquals(App.passwordValidator(samplePasswords[2]), 1);
        // false assertion
        assertNotEquals(App.passwordValidator(samplePasswords[3]), 2);

    };
}
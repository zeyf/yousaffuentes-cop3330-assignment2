package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void randInRange() {

        int min = 10, max = 50,
                randomInRange = App.randInRange(min, max);

        // true assertion
        assertTrue(randomInRange >= 10 && randomInRange <= 50);
        // false assertion
        assertFalse(randomInRange < 10 && randomInRange > 50);


    };

    @Test
    public void verifyPlayAgain() {

        String YES = "y", NO = "n";

        // true assertion
        assertTrue(App.verifyPlayAgain(YES));
        // true assertion 2
        assertFalse(App.verifyPlayAgain(NO));
        // false assertion
        assertFalse(App.verifyPlayAgain("D"));

    };
}
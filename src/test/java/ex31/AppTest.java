package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void calculateTestingHeartRate() {
        // true assertion
        assertEquals(341, App.calculateTestingHeartRate(10, 500, 55));
        // false assertion
        assertNotEquals(380, App.calculateTestingHeartRate(10, 500, 55));
    };
}
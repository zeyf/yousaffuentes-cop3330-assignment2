package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void calculateSum() {

        // true assertion
        assertEquals(250, App.calculateProduct(50, 5));
        // false assertion
        assertNotEquals(13, App.calculateProduct(50, 5));

    };

}
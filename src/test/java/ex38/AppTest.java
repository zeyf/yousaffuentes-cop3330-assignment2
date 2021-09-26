package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void filterEvenNumbers() {

        int []sampleNumbers = { 22, 10, 5, 7, 11, 13, 16, 21 };
        int []expectedFilteredEvenNumbers = { 22, 10, 16 };

        // true assertion
        assertArrayEquals(expectedFilteredEvenNumbers, App.filterEvenNumbers(sampleNumbers));

    };


}
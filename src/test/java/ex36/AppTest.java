package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final int [] sampleNumbersArray = { 50, 53, 31, 32, 800, 4, 5, 2, 50, 332, 10 };


    @Test
    public void min() {

        ArrayList<Integer> sampleNumbersList = new ArrayList<Integer>();
        for (int x = 0; x < sampleNumbersArray.length; x++)
            sampleNumbersList.add(sampleNumbersArray[x]);

        // true assertion
        assertEquals(2, App.min(sampleNumbersList));
        // false assertion
        assertNotEquals(4, App.min(sampleNumbersList));

    };

    @Test
    public void max() {

        ArrayList<Integer> sampleNumbersList = new ArrayList<Integer>();
        for (int x = 0; x < sampleNumbersArray.length; x++)
            sampleNumbersList.add(sampleNumbersArray[x]);

        // true assertion
        assertEquals(800, App.max(sampleNumbersList));
        // false assertion
        assertNotEquals(4, App.max(sampleNumbersList));

    };

    @Test
    public void average() {

        ArrayList<Integer> sampleNumbersList = new ArrayList<Integer>();
        for (int x = 0; x < sampleNumbersArray.length; x++)
            sampleNumbersList.add(sampleNumbersArray[x]);

        double sum = 0, average;
        for (int x = 0; x < sampleNumbersList.size(); x++)
            sum += sampleNumbersList.get(x);

        average = sum / sampleNumbersList.size();

        // true assertion
        assertEquals(average, App.average(sampleNumbersList));
        // false assertion
        assertNotEquals(4, App.average(sampleNumbersList));

    };

    @Test
    public void std() {

        double sum = 0, average, stdev = 0, finalstd;

        ArrayList<Integer> sampleNumbersList = new ArrayList<Integer>();
        for (int x = 0; x < sampleNumbersArray.length; x++)
            sampleNumbersList.add(sampleNumbersArray[x]);


        for (int x = 0; x < sampleNumbersList.size(); x++)
            sum += sampleNumbersList.get(x);

        average = sum / sampleNumbersList.size();

        for (int k: sampleNumbersList) {
            stdev += Math.pow(k - average, 2);
        };

        finalstd = Math.sqrt(stdev/sampleNumbersList.size());

        // true assertion
        assertEquals(finalstd, App.std(sampleNumbersList));
        // false assertion
        assertNotEquals(50, App.std(sampleNumbersList));


    };
}
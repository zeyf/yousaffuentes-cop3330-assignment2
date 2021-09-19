package ex36;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private App ex36 = new App();
    private int [] sampleNumbersArray = { 50, 53, 31, 32, 800, 4, 5, 2, 50, 332, 10 };


    @Test
    public void test_min() {

        ArrayList<Integer> sampleNumbersList = new ArrayList<Integer>();
        for (int x = 0; x < sampleNumbersArray.length; x++)
            sampleNumbersList.add(sampleNumbersArray[x]);

        // true assertion
        assertEquals(2, ex36.min(sampleNumbersList));
        // false assertion
        assertNotEquals(4, ex36.min(sampleNumbersList));

    };

    @Test
    public void test_max() {

        ArrayList<Integer> sampleNumbersList = new ArrayList<Integer>();
        for (int x = 0; x < sampleNumbersArray.length; x++)
            sampleNumbersList.add(sampleNumbersArray[x]);

        // true assertion
        assertEquals(800, ex36.max(sampleNumbersList));
        // false assertion
        assertNotEquals(4, ex36.max(sampleNumbersList));

    };

    @Test
    public void test_average() {

        ArrayList<Integer> sampleNumbersList = new ArrayList<Integer>();
        for (int x = 0; x < sampleNumbersArray.length; x++)
            sampleNumbersList.add(sampleNumbersArray[x]);

        double sum = 0, average;
        for (int x = 0; x < sampleNumbersList.size(); x++)
            sum += sampleNumbersList.get(x);

        average = sum / sampleNumbersList.size();

        // true assertion
        assertEquals(average, ex36.average(sampleNumbersList));
        // false assertion
        assertNotEquals(4, ex36.average(sampleNumbersList));

    };

    @Test
    public void test_std() {

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
        assertEquals(finalstd, ex36.std(sampleNumbersList));
        // false assertion
        assertNotEquals(50, ex36.std(sampleNumbersList));


    };

}

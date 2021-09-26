package ex38;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App ex38 = new App();


    @Test
    public void filterEvenNumbers() {

        int []sampleNumbers = { 22, 10, 5, 7, 11, 13, 16, 21 };
        int []expectedFilteredEvenNumbers = { 22, 10, 16 };

        // true assertion
        assertArrayEquals(expectedFilteredEvenNumbers, ex38.filterEvenNumbers(sampleNumbers));

    };


}
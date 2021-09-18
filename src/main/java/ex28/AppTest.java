package ex28;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    static App ex28 = new App();

    @Test
    public void test_calculateSum() {

        int [] testArray = { 1, 2, 3, 4, 5 };

        // true assertion
        assertEquals("The total is 15.", ex28.calculateSum(testArray));
        // false assertion
        assertNotEquals("The total is 42.", ex28.calculateSum(testArray));


    };

}

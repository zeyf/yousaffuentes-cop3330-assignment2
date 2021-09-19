package ex29;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    App ex29 = new App();

    @Test
    public void test_calculateYearsToDoubleInvestment() {

        // true assertion 1
        assertEquals(18, ex29.calculateYearsToDoubleInvestment(4));
        // true assertion 2
        assertEquals(9, ex29.calculateYearsToDoubleInvestment(8));
        // false assertion
        assertNotEquals(10, ex29.calculateYearsToDoubleInvestment(10));
    };

}

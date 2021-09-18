package ex26;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentCalculatorTest {

    static PaymentCalculator calculator = new PaymentCalculator();

    @Test
    public void test_calculateMonthsUntilPaidOff() {

        // true assertion
        assertEquals(calculator.calculateMonthsUntilPaidOff(12.0/100/365, 5000, 100), 70);
        // false assertion
        assertNotEquals(calculator.calculateMonthsUntilPaidOff(12.0/100/365, 5000, 100), 55);

    };

}

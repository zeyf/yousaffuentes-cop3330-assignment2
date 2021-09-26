package ex26;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {


    @Test
    public void calculateMonthsUntilPaidOff() {

        // true assertion
        assertEquals(PaymentCalculator.calculateMonthsUntilPaidOff(12.0/100/365, 5000, 100), 70);
        // false assertion
        assertNotEquals(PaymentCalculator.calculateMonthsUntilPaidOff(12.0/100/365, 5000, 100), 55);

    };
}
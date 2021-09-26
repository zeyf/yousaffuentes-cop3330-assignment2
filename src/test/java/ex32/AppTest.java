package ex32;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App ex32 = new App();

    @Test
    public void randInRange() {

        int min = 10, max = 50,
                randomInRange = ex32.randInRange(min, max);

        // true assertion
        assertTrue(randomInRange >= 10 && randomInRange <= 50);
        // false assertion
        assertFalse(randomInRange < 10 && randomInRange > 50);


    };

    @Test
    public void verifyPlayAgain() {

        String YES = "y", NO = "n";

        // true assertion
        assertTrue(ex32.verifyPlayAgain(YES));
        // true assertion 2
        assertFalse(ex32.verifyPlayAgain(NO));
        // false assertion
        assertFalse(ex32.verifyPlayAgain("D"));

    };
}
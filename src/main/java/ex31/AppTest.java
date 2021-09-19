package ex31;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App ex31 = new App();


    @Test
    public void test_calculateTestingHeartRate() {
        // true assertion
        assertEquals(341, ex31.calculateTestingHeartRate(10, 500, 55));
        // false assertion
        assertNotEquals(380, ex31.calculateTestingHeartRate(10, 500, 55));
    };


}

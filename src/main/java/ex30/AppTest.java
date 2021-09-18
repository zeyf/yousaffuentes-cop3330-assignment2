package ex30;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    static App ex30 = new App();

    @Test
    public void test_calculateSum() {

        // true assertion
        assertEquals(250, ex30.calculateProduct(50, 5));
        // false assertion
        assertNotEquals(13, ex30.calculateProduct(50, 5));

    };

}
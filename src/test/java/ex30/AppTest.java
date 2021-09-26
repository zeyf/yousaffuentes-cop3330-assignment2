package ex30;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    static App ex30 = new App();

    @Test
    public void calculateSum() {

        // true assertion
        assertEquals(250, ex30.calculateProduct(50, 5));
        // false assertion
        assertNotEquals(13, ex30.calculateProduct(50, 5));

    };

}
package ex27;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    static App ex27 = new App();

    @Test
    public void test_validateEmployeeID() {

        // true assertion
        assertTrue(ex27.validateEmployeeID("AA-1234"));
        // false assertion
        assertFalse(ex27.validateEmployeeID("AA-3"));

    };

    @Test
    public void test_validateNameExists() {

        // true assertion
        assertTrue(ex27.validateNameExists("john"));
        // false assertion
        assertFalse(ex27.validateNameExists(""));

    };

    @Test
    public void test_validateNameLength() {

        // true assertion
        assertTrue(ex27.validateNameLength("zain"));
        // false assertion
        assertFalse(ex27.validateNameLength("a"));

    };

    @Test
    public void test_validateZipCode() {

        // true assertion
        assertTrue(ex27.validateZipCode("33196"));
        // false assertion 1
        assertFalse(ex27.validateZipCode("33333333"));
        // false assertion 2
        assertFalse(ex27.validateZipCode("he24955k"));

    };

    @Test
    public void test_validateInput() {

        // true assertion
        assertEquals("There were no errors found.", ex27.validateInput("john", "johnson", "32259", "AA-4324"));
        // false assertion
        assertNotEquals("There were no errors found.", ex27.validateInput("", "j", "322jf31", "AA-4324"));

    };

}

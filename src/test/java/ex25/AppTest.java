package ex25;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    static App ex25 = new App();

    @Test
    public void passwordValidator() {


        String[] samplePasswords = {
                "12345",
                "hey",
                "heythere445",
                "hello12345%!"
        };

        // true assertion
        assertEquals(ex25.passwordValidator(samplePasswords[0]), 0);
        // true assertion
        assertEquals(ex25.passwordValidator(samplePasswords[1]), 1);
        // true assertion
        assertEquals(ex25.passwordValidator(samplePasswords[2]), 2);
        // true assertion
        assertEquals(ex25.passwordValidator(samplePasswords[3]), 3);

        // false assertion
        assertNotEquals(ex25.passwordValidator(samplePasswords[0]), 1);
        // false assertion
        assertNotEquals(ex25.passwordValidator(samplePasswords[1]), 3);
        // false assertion
        assertNotEquals(ex25.passwordValidator(samplePasswords[2]), 1);
        // false assertion
        assertNotEquals(ex25.passwordValidator(samplePasswords[3]), 2);

    };
}
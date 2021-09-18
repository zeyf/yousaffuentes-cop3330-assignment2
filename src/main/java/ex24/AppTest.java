package ex24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    static App ex24 = new App();

    @Test
    public void test_isAnagram() {



        // same string assertion
        assertTrue(ex24.isAnagram("hello", "hello"), "Same string (anagram) asserts as true.");
        // anagram string, non same string assertion
        assertTrue(ex24.isAnagram("hlloe", "elolh"), "Valid string anagrams asserts as true.");
        // non anagram, non same string assertion
        assertFalse(ex24.isAnagram("hello", "hey"), "Non-anagram strings assert as false.");

    };

}
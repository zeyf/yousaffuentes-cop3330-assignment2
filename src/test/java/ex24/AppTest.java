package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void isAnagram() {

        // same string assertion
        assertTrue(App.isAnagram("hello", "hello"), "Same string (anagram) asserts as true.");
        // anagram string, non same string assertion
        assertTrue(App.isAnagram("hlloe", "elolh"), "Valid string anagrams asserts as true.");
        // non anagram, non same string assertion
        assertFalse(App.isAnagram("hello", "hey"), "Non-anagram strings assert as false.");

    };

}
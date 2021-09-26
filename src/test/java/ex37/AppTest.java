package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    final int SIZE = 10;
    final int numbersToAddCount = 3, specialCharactersToAddCount = 4;

    char [] password = new char[SIZE];
    final char [] specialchars = { '!', '@', '#', '$', '%', '^', '&', '*' };
    final char [] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    final char [] letters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    @Test
    public void fillWithLetters() {

        App.fillWithLetters(password, letters);

        int letterCount = 0;

        for (char c: password)
            if (Character.isLetter(c))
                letterCount++;


        // true assertion
        assertEquals(SIZE, letterCount);

    };

    @Test
    public void integrateRandomNumbers() {

        App.fillWithLetters(password, letters);
        App.integrateRandomNumbers(password, digits, numbersToAddCount);

        int numbersFound = 0;

        for (int x = 0; x < password.length; x++)
            if (Character.isDigit(password[x]))
                numbersFound++;

        // true assertion
        assertEquals(numbersToAddCount,numbersFound);

    };

    @Test
    public void integrateSpecialCharacters() {

        App.fillWithLetters(password, letters);
        App.integrateRandomNumbers(password, digits, numbersToAddCount);
        App.integrateRandomSpecialCharacters(password, specialchars, specialCharactersToAddCount);

        int specialCharactersFound = 0;

        for (int x = 0; x < password.length; x++)
            if(!Character.isLetterOrDigit(password[x]))
                specialCharactersFound++;

        // true assertion
        assertEquals(specialCharactersToAddCount, specialCharactersFound);

    };
}
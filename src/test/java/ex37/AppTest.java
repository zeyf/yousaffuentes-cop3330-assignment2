package ex37;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    final int SIZE = 10;
    int numbersToAddCount = 3, specialCharactersToAddCount = 4;
    App ex37 = new App();
    char [] password = new char[SIZE];
    char [] specialchars = { '!', '@', '#', '$', '%', '^', '&', '*' };
    char [] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    char [] letters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    @Test
    public void fillWithLetters() {

        ex37.fillWithLetters(password, letters);

        int letterCount = 0;

        for (char c: password)
            if (Character.isLetter(c))
                letterCount++;


        // true assertion
        assertEquals(SIZE, letterCount);

    };

    @Test
    public void integrateRandomNumbers() {

        ex37.fillWithLetters(password, letters);
        ex37.integrateRandomNumbers(password, digits, numbersToAddCount);

        int numbersFound = 0;

        for (int x = 0; x < password.length; x++)
            if (Character.isDigit(password[x]))
                numbersFound++;

        // true assertion
        assertEquals(numbersToAddCount,numbersFound);

    };

    @Test
    public void integrateSpecialCharacters() {

        ex37.fillWithLetters(password, letters);
        ex37.integrateRandomNumbers(password, digits, numbersToAddCount);
        ex37.integrateRandomSpecialCharacters(password, specialchars, specialCharactersToAddCount);

        int specialCharactersFound = 0;

        for (int x = 0; x < password.length; x++)
            if(!Character.isLetterOrDigit(password[x]))
                specialCharactersFound++;

        // true assertion
        assertEquals(specialCharactersToAddCount, specialCharactersFound);

    };
}
package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void checkNameExistence() {

        String validName = "Zain", invalidName = "";

        //true assertion
        assertTrue(App.checkNameExistence(validName));
        //false assertion
        assertFalse(App.checkNameExistence(invalidName));


    };

    @Test
    public void createWinnerMessage() {

        ArrayList<String> list = new ArrayList<String>();
        Random r = new Random();

        list.add("John");
        list.add("Michael");
        list.add("Zain");

        int randomIndex1 = r.nextInt(list.size()), randomIndex2 = r.nextInt(list.size());

        while (randomIndex2 == randomIndex1)
            randomIndex2 = r.nextInt(list.size());

        // true assertion
        assertEquals(String.format("The winner is... %s.", list.get(randomIndex1)), App.createWinnerMessage(list, randomIndex1));
        // false assertion
        assertNotEquals(String.format("The winner is... %s.", list.get(randomIndex1)), App.createWinnerMessage(list, randomIndex2));

    };

}
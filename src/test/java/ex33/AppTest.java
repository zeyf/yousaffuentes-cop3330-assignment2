package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 zain yousaffuentes
 */
import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void pickRandomTemplate() {

        Random r = new Random();
        int MAX_EXCLUSIVE = 3, randomIndex1 =  r.nextInt(MAX_EXCLUSIVE), randomIndex2 = r.nextInt(MAX_EXCLUSIVE);

        while (randomIndex2 == randomIndex1)
            randomIndex2 = r.nextInt(MAX_EXCLUSIVE);

        String [] templates = { "Yes", "No", "Ask again later." };

        // true assertion
        assertTrue(App.pickRandomTemplate(randomIndex1).equals(templates[randomIndex1]));
        // false assertion
        assertFalse(App.pickRandomTemplate(randomIndex1).equals(templates[randomIndex2]));

    };

}
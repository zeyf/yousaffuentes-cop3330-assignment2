package ex35;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App ex35 = new App();

    @Test
    public void test_checkNameExistence() {

        String validName = "Zain", invalidName = "";

        //true assertion
        assertTrue(ex35.checkNameExistence(validName));
        //false assertion
        assertFalse(ex35.checkNameExistence(invalidName));


    };

    @Test
    public void test_createWinnerMessage() {

        ArrayList<String> list = new ArrayList<String>();
        Random r = new Random();

        list.add("John");
        list.add("Michael");
        list.add("Zain");

        int randomIndex1 = r.nextInt(list.size()), randomIndex2 = r.nextInt(list.size());

        while (randomIndex2 == randomIndex1)
            randomIndex2 = r.nextInt(list.size());

        // true assertion
        assertEquals(String.format("The winner is... %s.", list.get(randomIndex1)), ex35.createWinnerMessage(list, randomIndex1));
        // false assertion
        assertNotEquals(String.format("The winner is... %s.", list.get(randomIndex1)), ex35.createWinnerMessage(list, randomIndex2));

    };

}

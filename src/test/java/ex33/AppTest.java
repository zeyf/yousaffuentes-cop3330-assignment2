package ex33;

import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App ex33 = new App();

    @Test
    public void pickRandomTemplate() {

        Random r = new Random();
        int MAX_EXCLUSIVE = 3, randomIndex1 =  r.nextInt(MAX_EXCLUSIVE), randomIndex2 = r.nextInt(MAX_EXCLUSIVE);

        while (randomIndex2 == randomIndex1)
            randomIndex2 = r.nextInt(MAX_EXCLUSIVE);

        String [] templates = { "Yes", "No", "Ask again later." };

        // true assertion
        assertTrue(ex33.pickRandomTemplate(randomIndex1).equals(templates[randomIndex1]));
        // false assertion
        assertFalse(ex33.pickRandomTemplate(randomIndex1).equals(templates[randomIndex2]));

    };

}
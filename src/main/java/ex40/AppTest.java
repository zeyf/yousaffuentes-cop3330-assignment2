package ex40;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    App ex40 = new App();

    @Test
    public void test_subStringFind() {

        String mainString = "HelloWorld!", subString = "oWorl";

        // true assertion
        assertEquals(true, ex40.subStringFind(mainString, subString));

    };

    @Test
    public void test_sortEmployees() {

        ArrayList<Map<String, String>> preSortedEmployees = new ArrayList<Map<String, String>>();

        preSortedEmployees.add(Map.of(
                "First Name", "Alex",
                "Last Name", "Johnson"
        ));
        preSortedEmployees.add(Map.of(
                "First Name", "Zain",
                "Last Name", "Yousaf Fuentes"
        ));

        ArrayList<Map<String, String>> unSortedEmployees = new ArrayList<Map<String, String>>();

        unSortedEmployees.add(Map.of(
                "First Name", "Zain",
                "Last Name", "Yousaf Fuentes"
        ));
        unSortedEmployees.add(Map.of(
                "First Name", "Alex",
                "Last Name", "Johnson"
        ));

        ex40.sortEmployees(unSortedEmployees, "Last Name");

        boolean sortedOrder = true;

        for (int x = 0; x < unSortedEmployees.size() && sortedOrder; x++)
            if (unSortedEmployees.get(x).get("Last Name") != preSortedEmployees.get(x).get("Last Name"))
                sortedOrder = false;

        // true assertion
        assertTrue(sortedOrder); // assert that the post sortEmployees function does what it claims to

    };

}

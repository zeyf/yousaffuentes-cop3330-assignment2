package ex34;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App ex34 = new App();

    @Test
    public void filterEmployee() {

        String [] preFilteredEmployees = { "John", "Zain", "Michael", "Drake", "Lionel", "Cristiano" };
        String employeeToRemove1 = "Michael", employeeToRemove2 = "Drake";
        String [] postFilteredEmployeees1 = { "John", "Zain", "Drake", "Lionel", "Cristiano" }; // Michael is removed
        String [] postFilteredEmployeees2 = { "John", "Zain", "Michael", "Lionel", "Cristiano" }; // Drake is removed

        // true assertion
        assertArrayEquals(postFilteredEmployeees1, ex34.filterEmployee(preFilteredEmployees, employeeToRemove1));
        // true assertion 2
        assertArrayEquals(postFilteredEmployeees2, ex34.filterEmployee(preFilteredEmployees, employeeToRemove2));


    };
}
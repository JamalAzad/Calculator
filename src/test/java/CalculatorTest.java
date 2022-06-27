import org.testng.annotations.Test;


public class CalculatorTest {

    @Test
    public void addTest() {
        int a = 2;
        int b = 2;
        int expectedValue = 4;
        int actualResult = Calculator.add(a, b);
        // expectedValue == actualResult --> add() method is working. Test Passed
        // expectedValue != actualResult --> add() method is not working. Test Failed

        if (expectedValue == actualResult) {
            System.out.println("Test Passed");
        } else if (expectedValue != actualResult) {
            System.out.println("Test Failed");
        }

        // Assert.assertEquals(expectedValue, actualResult);

        // System.out.println("Oh Great Calculator App is work//ing well...");
    }

    @Test
    public void deductTest() {
        // Reassigning the value to the actual variable  after calling deduct()
//        int a = 2;
//        int b = 2;
        int expectedValue = -1;
        int actualResult = Calculator.deduct();
//        Assert.assertEquals(expectedValue, actualResult); // Pass/Fail
//         Any line of code from here not going to be executed in case test fails

        if (expectedValue == actualResult) {
            System.out.println("Test Passed");
        } else if (expectedValue != actualResult) {
            System.out.println("Test Failed");
        }
    }
}
package Core.Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    /*
    In a hard assertion, when the assertion fails, it terminates or aborts the test.
    If the tester does not want to terminate the script, they cannot use hard assertions.
    To overcome this, one can use soft assertions.
     */
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testSoftAssertions() {
        String actualTitle = "Hello";
        String expectedTitle = "Mello";
        softAssert.assertEquals(actualTitle,expectedTitle);
        // Testers need to invoke the assertAll() method to view the results.
        softAssert.assertAll();
    }

    @Test
    public void anotherTest() {
        softAssert.assertEquals(1,1);
        System.out.println("Assertion passed");
    }
}

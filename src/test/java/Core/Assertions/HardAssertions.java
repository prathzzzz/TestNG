package Core.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    /*
    Hard Assertions are ones in which test execution is aborted if the test does not meet the assertion condition.
    The test case is marked as failed.
    In case of an assertion error, it will throw the “java.lang.AssertionError” exception.
     */
    @Test
    public void testAssertFunctions() {
        String actualTitle = "Hello";
        String expectedTitle = "Mello";

        /*
        assertEquals() is a method that takes a minimum of 2 arguments and compares actual results with expected results.
        If both match, the assertion is passed, and the test case is marked as passed. assertEquals() can compare Strings, Integers, Doubles, and many more variables
        */
        Assert.assertEquals(actualTitle, expectedTitle);

        /*
        assertNotEquals() is a method that does the opposite of the assertEquals() method.
        In this case, the method compares the actual and expected result.
        But if the assertion condition is met if the two are not identical.
        The test case is marked as passed if actual and expected results are not the same.
         */
        Assert.assertNotEquals(actualTitle, expectedTitle);

        /*
        assertTrue(): This Assertion verifies the Boolean value returned by the condition.
        If the Boolean value is true, then the assertion passes the test case.
        */
        Assert.assertTrue(1 == 1);

        /*
        assertFalse(): This method works the opposite of assertTrue().
        The Assertion verifies the Boolean value returned by the condition.
        If the Boolean value is false, the assertion passes the test case.
         */
        Assert.assertFalse(1 == 1);
    }

}

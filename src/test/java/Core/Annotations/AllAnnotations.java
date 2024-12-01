package Core.Annotations;

import org.testng.annotations.*;

public class AllAnnotations {
    // Test Case 1
    @Test
    public void test1() {
        System.out.println("Test Case 1");
    }
    /*
     * @Test is used to mark a method as a test case in TestNG.
     * Each test case is executed based on the test lifecycle defined by TestNG.
     */

    // Test Case 2
    @Test
    public void test2() {
        System.out.println("Test Case 2");
    }
    /*
     * @Test allows us to define multiple test cases within the same class.
     * Each test case runs independently of others unless explicitly defined dependencies exist.
     */

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    /*
     * @BeforeMethod is executed before each @Test method in the class.
     * It is often used to set up preconditions or initialize resources required for each test case.
     */

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
    /*
     * @AfterMethod is executed after each @Test method in the class.
     * It is commonly used to clean up or release resources after a test case execution.
     */

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    /*
     * @BeforeClass is executed once before any @Test method in the current class is run.
     * It is useful for setting up configurations or resources that are shared across all test cases in the class.
     */

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
    /*
     * @AfterClass is executed once after all @Test methods in the current class have been run.
     * It is used to perform cleanup tasks that apply to all tests in the class, such as closing shared resources.
     */

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    /*
     * @BeforeTest is executed once before the execution of any @Test methods
     * within a <test> tag in the TestNG XML configuration file.
     * It is used for high-level setup specific to the <test> group.
     */

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
    /*
     * @AfterTest is executed once after all @Test methods within a <test> tag
     * in the TestNG XML configuration file have been run.
     * It is useful for performing high-level cleanup tasks.
     */

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
    /*
     * @BeforeSuite is executed once before all tests in the entire suite are run.
     * It is used for global setup tasks, such as initializing a database connection
     * or starting a server required for the tests.
     */

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
    /*
     * @AfterSuite is executed once after all tests in the entire suite have been run.
     * It is used for global cleanup tasks, such as closing database connections
     * or shutting down servers initialized in @BeforeSuite.
     */
}

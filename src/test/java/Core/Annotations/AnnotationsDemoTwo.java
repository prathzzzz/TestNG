package Core.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemoTwo {

    // This method will execute once before any test methods in the class are executed.
    // Typically used for setup activities, such as logging into an application.
    @BeforeClass
    public void login() {
        System.out.println("Login");
    }

    // This is a test case representing a basic search functionality.
    // The priority ensures it runs first among the test methods in this class.
    @Test(priority = 1)
    public void search() {
        System.out.println("Search");
    }

    // This is a test case representing an advanced search functionality.
    // The priority ensures it runs after the basic search test case.
    @Test(priority = 2)
    public void advancedSearch() {
        System.out.println("Advanced Search");
    }

    // This method will execute once after all the test methods in the class have been executed.
    // Typically used for cleanup activities, such as logging out of an application.
    @AfterClass
    public void logout() {
        System.out.println("Logout");
    }
}

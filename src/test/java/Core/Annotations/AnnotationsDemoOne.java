package Core.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemoOne {

    /**
     * This method will run before each test method in the current class.
     * Commonly used for setup activities like logging in or initializing test data.
     */
    @BeforeMethod
    public static void login() {
        System.out.println("Login");
    }

    /**
     * This annotation identifies a method as a test case.
     * The 'search' method represents a test scenario for performing a basic search.
     */
    @Test
    public static void search() {
        System.out.println("Search");
    }

    /**
     * This annotation identifies another test case.
     * The 'advancedSearch' method represents a test scenario for performing an advanced search.
     */
    @Test
    public static void advancedSearch() {
        System.out.println("Advanced Search");
    }

    /**
     * This method will run after each test method in the current class.
     * Commonly used for cleanup activities like logging out or resetting test data.
     */
    @AfterMethod
    public static void logout() {
        System.out.println("Logout");
    }
}

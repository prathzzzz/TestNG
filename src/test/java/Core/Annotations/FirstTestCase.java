package Core.Annotations;

import org.testng.annotations.Test;

public class FirstTestCase {
    // Priority controls order of execution
    @Test(priority = 1)
    void openApp() {
        System.out.println("openApp");
    }
    @Test(priority = 2)
    void login() {
        System.out.println("login");
    }
    @Test(priority = 3)
    void logout() {
        System.out.println("logout");
    }
}

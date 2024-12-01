package Core.Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
    @Test(priority = 1)
    public void openApp() {
        System.out.println("openApp");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 2, dependsOnMethods = "openApp")
    public void login() {
        Assert.assertEquals(1,2);
    }

    @Test(priority = 3,dependsOnMethods = "login")
    public void search() {
        System.out.println("Searching");
    }

    @Test(priority = 4,dependsOnMethods = "login")
    public void advanceSearch() {
        System.out.println("Advance Searching");
    }
}

package Core.Dependency.Groups;

import org.testng.annotations.Test;

public class Login {
    @Test(priority = 1,groups = {"sanity"})
    public void loginByEmail() {
        System.out.println("Login by email");
    }
    @Test(priority = 2,groups = {"sanity"})
    public void loginByGoogle() {
        System.out.println("Login by google");
    }
}

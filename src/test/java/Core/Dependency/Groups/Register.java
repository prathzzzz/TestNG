package Core.Dependency.Groups;

import org.testng.annotations.Test;

public class Register {
    @Test(priority = 1,groups = {"regression"})
    public void signUpByEmail() {
        System.out.println("Sign Up by email");
    }
    @Test(priority = 2,groups = {"regression"})
    public void signUpByGoogle() {
        System.out.println("Sign Up by google");
    }
}

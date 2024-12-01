package Core.Dependency.Groups;

import org.testng.annotations.Test;

public class Payment {
    @Test(priority = 1,groups = {"sanity", "regression"})
    public void paymentByRupees() {
        System.out.println("Payment in rupees");
    }

    @Test(priority = 2,groups = {"sanity","regression"})
    public void paymentByDollars() {
        System.out.println("Payment in Dollars");
    }
}

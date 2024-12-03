package Core.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*
    We can either extend or implement TestListener
    Listeners are TestNG annotations that literally “listen” to the events in a script and modify TestNG behavior accordingly.
    These listeners are applied as interfaces in the code.
    For example, the most common usage of listeners occurs when taking a screenshot of a test that has failed and the reason for its failure. Listeners also help with logging and generating results.
 */
public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Every Test it will start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("failed");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("skipped");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Execution Started ( on start )");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("finished");
    }
}

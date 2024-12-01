package Core.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParamBrowserDemo {
    WebDriver driver;
    WebDriverWait wait;
    ChromeOptions chromeOptions;
    EdgeOptions edgeOptions;

    /*
     * Parameterization and Thread Count in TestNG:
     *
     * Parameterization:
     * 1. TestNG supports parameterization, allowing you to pass values from the test suite XML file
     *    to your test methods or setup methods.
     * 2. The `@Parameters` annotation is used to inject the `browser` parameter
     *    from the TestNG XML file into the `setup` method. This helps in running the same test case
     *    on multiple browsers or configurations without duplicating code.
     * 3. The parameter value, such as "chrome" or "edge," determines which browser is initialized in
     *    the `setup` method.
     * 4. This approach enhances code reusability and simplifies configuration management by
     *    centralizing variable definitions in the XML file.
     */
    @Parameters("browser")
    @BeforeClass
    public void setup(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                chromeOptions = new ChromeOptions().addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                edgeOptions = new EdgeOptions().addArguments("--headless");
                driver = new EdgeDriver(edgeOptions);

                break;
            default:
                System.out.println("Unsupported browser");
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void testLogo() {
        boolean logoStatus = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='company-branding']")))).isDisplayed();
        if (logoStatus) {
            System.out.println(logoStatus);
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

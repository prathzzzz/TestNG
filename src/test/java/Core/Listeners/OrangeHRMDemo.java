package Core.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMDemo {
    WebDriver driver;
    WebDriverWait wait;
    ChromeOptions options;
    @BeforeClass
    public void setup() {
        options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    public void testLogo() {
        boolean logoStatus = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='company-branding']")))).isDisplayed();
        Assert.assertTrue(logoStatus);
    }

    @Test(priority = 2)
    public void testAppUrl() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 3,dependsOnMethods = {"testAppUrl"})
    public void testHomePageTitle() {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

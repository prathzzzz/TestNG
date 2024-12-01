package Core.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMDemo {
    WebDriver driver;
    ChromeOptions chromeOptions;
    @Test(priority = 1)
    public void openApp() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 2)
    public void checkIfLogoIsDisplayed() throws InterruptedException {
        boolean logo =  driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Status of logo is: " + logo);
    }
    @Test(priority = 3)
    public void login() {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    }
    @Test(priority = 4)
    public void closeApp() {
        driver.quit();
    }
}

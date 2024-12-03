package Core.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTestWithoutPageFactory {
    WebDriver driver;
    LoginPageWithoutPageFactory loginPage;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPageWithoutPageFactory(driver);
    }

    @Test
    public void testLogin() {
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickLogin();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

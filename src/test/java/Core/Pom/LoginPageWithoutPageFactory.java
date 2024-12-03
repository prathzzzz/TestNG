package Core.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
    This is a Page Object Class for Login Page ( Without Page Factory )
    There are two methods to create page object class
    In this method, we find all locators and store in variables and then we create action methods which we can use in LoginTest
 */
public class LoginPageWithoutPageFactory {
    WebDriver driver;

    public LoginPageWithoutPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By textUsernameLocator = By.xpath("//input[@placeholder='Username']");
    By textPasswordLocator = By.xpath("//input[@placeholder='Password']");
    By loginBtnLocator = By.xpath("//button[normalize-space()='Login']");

    // Action methods
    public void setUsername(String username) {
        driver.findElement(textUsernameLocator).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(textPasswordLocator).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtnLocator).click();
    }

}

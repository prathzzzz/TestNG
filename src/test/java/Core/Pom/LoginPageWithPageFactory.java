package Core.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
    This is a Page Object Class for Login Page ( With Page Factory )
    There are two methods to create page object class
    To work with this, we need to use PageFactory class and its initElements method which accepts driver and the page which is ( this )
    In this method we use FindBy annotation and mention our xpath inside xpath variable and after that we mention the web element
    Easier to use than Without Page Factory
 */
public class LoginPageWithPageFactory {
    WebDriver driver;

    public LoginPageWithPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']") WebElement txtUsername;
    @FindBy(xpath = "//input[@placeholder='Password']") WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='Login']") WebElement btnLogin;

    // Action methods
    public void setUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void setPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }
}

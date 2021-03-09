package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    public static final String URL = "https://abcdef7.my.salesforce.com";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void login(String userName, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void loginClick() {
        driver.findElement(LOGIN_BUTTON).click();
    }
}
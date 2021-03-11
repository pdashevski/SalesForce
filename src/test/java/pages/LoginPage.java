package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    public static final String URL = "https://abcdef7.my.salesforce.com";
    public static final String login = "paveldashevski-pzpr@force.com";
    public static final String password = "552478Lil9";
    public static final By HEADER_AD = By.xpath("//*[@class='trial-tours']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void login() {
        driver.findElement(USERNAME_INPUT).sendKeys(login);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        loginClick();
    }

    public void loginClick() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean isSuccessfullLogin() {
        boolean isOpened;
        try {
            driver.findElement(HEADER_AD);
            isOpened = true;
        } catch (Exception ex) {
            isOpened = false;
        }
        return isOpened;
    }
}

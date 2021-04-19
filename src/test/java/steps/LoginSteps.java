package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.MainPage;

public class LoginSteps {
    WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    //login
    @Step("Login by '{user}'")
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        Assert.assertTrue(new MainPage(driver).isSuccessfullLogin(), "Page was not opened");
    }

    @Step("Open login page")
    public void open() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
    }
}

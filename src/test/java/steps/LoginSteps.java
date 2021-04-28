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

    @Step("Login by '{user}'")
    public void login(String userName, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(userName, password);
        Assert.assertTrue(new MainPage(driver).isSuccessfullLogin(), "Main Page was not opened");
    }
}

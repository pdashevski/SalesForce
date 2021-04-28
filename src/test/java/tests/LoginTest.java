package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    String login = "paveldashevski-pzpr@force.com";
    String password = "552478Lil9";

    @Test(description = "Main page opened with valid credentials")
    public void correctCredintialsLogin() {
        loginPage.open();
        loginPage.login(login, password);
    }
}

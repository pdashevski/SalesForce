package tests;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest{

    String login = "paveldashevski-pzpr@force.com";
    String password = "552478Lil9";

    @Test
    public void createContact() {
        loginPage.open();
        contactsPage.openContacts();
        loginPage.login(login, password);
        loginPage.loginClick();

        contactsPage.openContacts();
        contactsPage.createContact();

        driver.quit();
    }
}
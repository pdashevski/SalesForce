package steps;

import io.qameta.allure.Step;
import models.Account;
import org.openqa.selenium.WebDriver;
import pages.AccountListPage;
import pages.NewAccountModal;

public class AccountSteps {
    WebDriver driver;

    public AccountSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Creating contact: '{contact.lastName}'")
    public void create(Account account) {
        AccountListPage accountListPage = new AccountListPage(driver);
        accountListPage.open();
        accountListPage.isAccountPageOpened();
        accountListPage.clickNew();
        NewAccountModal newAccountModal = new NewAccountModal(driver);
        newAccountModal.createAccount(account);
        newAccountModal.save();
    }
}

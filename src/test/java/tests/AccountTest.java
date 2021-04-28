package tests;

import models.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest{
    String login = "paveldashevski-pzpr@force.com";
    String password = "552478Lil9";

    @Test(description = "Creation of contact" /* ,retryAnalyzer = Retry.class*/)
    public void createContact() {
        loginSteps.login(login, password);
        Account account = new Account("123",
                "ABBB",
                "+3757777777",
                "+375888888888",
                "tut@tut.tut",
                "Investor",
                "Technology",
                "Jack",
                "kit",
                "kit",
                "kit",
                "kit",
                "kit",
                "kit",
                "kit",
                "kit",
                "kit",
                "kit",
                "kit",
                "kit");
        accountSteps.create(account);
    }
}

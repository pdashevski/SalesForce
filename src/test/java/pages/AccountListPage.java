package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccountListPage extends BasePage {
    public static final By NEW_BUTTON = By.xpath("//*[@title='New']");
    public static final By PERMANENT_ACCOUNT_ELEMENT = By.xpath("//*[@title='']");
    public static final By CONTACT_ELEMENT = By.xpath("//*[@title='%s']");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening contacts page")
    public void open() {
        driver.get("https://abcdef7.lightning.force.com/lightning/o/Account/list?filterName=Recent");
    }

    @Step("Click 'New' button")
    public void clickNew() {
        driver.findElement(NEW_BUTTON).click();
    }

    public void isAccountPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PERMANENT_ACCOUNT_ELEMENT));
        } catch (TimeoutException ex) {
            Assert.fail("Account page was not loaded");
        }
    }
}

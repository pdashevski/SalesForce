package pages;

import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ContactListPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    public static final By SPINNER = By.xpath("//*[contains(@class,'windowViewMode-maximized')]");
    public static final String LASTNAME = "//*[@class='custom-truncate uiOutputText']";

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening contact list")
    public void open() {
        driver.get("https://abcdef7.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
    }

    @Step("Click [New] button")
    public void clickNew() {
        driver.findElement(NEW_BUTTON).click();
    }

    @Step("Contact list loading wait")
    public void isContactPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SPINNER));
        } catch (Exception ex) {
            Assert.fail("Страница контактов не была загружена");
        }
    }

    @Step("Validation of created contact")
    public boolean validateContact(Contact contact, String lastName) {
        return driver.findElement(By.xpath(String.format(LASTNAME, lastName))).getText().equals(contact.getLastName());
    }
}

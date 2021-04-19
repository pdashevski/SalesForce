package pages;

import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContactListPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    public static final By SPINNER = By.xpath("//*[contains(@class,'windowViewMode-maximized')]");
    public static final String LASTNAME = "//*[contains(@class,'listViewContent')]//span//a[text()='%s']";

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

    public void spinnerWait() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SPINNER));
        } catch (Exception e) {
            Assert.fail("Contact list is not loaded");
        }
    }

    public boolean validateContact(Contact contact, String lastName) {
        return driver.findElement(By.xpath(String.format(LASTNAME, lastName))).getText().equals(contact.getLastName());
    }

    public void networkThrotting() throws IOException {
        Map map = new HashMap();
        map.put("offline", false);
        map.put("latency", 5);
        map.put("download_throughput", 5000);
        map.put("upload_throughput", 5000);


        CommandExecutor executor = ((ChromeDriver) driver).getCommandExecutor();
        Response response = executor.execute(
                new Command(((ChromeDriver) driver).getSessionId(), "setNetworkConditions", ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map)))
        );
    }
}

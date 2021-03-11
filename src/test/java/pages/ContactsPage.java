package pages;

import com.google.common.collect.ImmutableMap;
import elements.DropDown;
import elements.LookUp;
import elements.TextArea;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import elements.Input;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class ContactsPage extends BasePage {

    public static final String LASTNAME = "//*[contains(@class,'listViewContent')]//span//a[text()='%s']";
    public static final By SPINNER = By.xpath("//*[contains(@class,'windowViewMode-maximized')]");
    String url = "https://abcdef7.lightning.force.com/lightning/o/Contact/" +
            "new?count=2&nooverride=1&useRecordTypeCheck=1&navigationLocation=" +
            "MRU_LIST&backgroundContext=%2Flightning%2Fo%2FContact%2Flist%3FfilterName%3DRecent";

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening new modal contacts page")
    public void openNewContacts() {
        driver.get(url);
    }

    public void openContactPage() {
        driver.get("https://abcdef7.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
    }

    @Step("Creating contact: {contact.lastName}")
    public void createContact(Contact contact) {
        new Input(driver, "Last Name").write(contact.getLastName());
        //new Input(driver, "First Name").write(contact.getFirstName());
        new DropDown(driver, "Salutation").choseSalutation(contact.getSalutation());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new LookUp(driver, "Account Name").select(contact.getAccountName());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getPostalCode());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Input(driver, "Department").write(contact.getDepartment());
        new DropDown(driver, "Lead Source").choseSalutation(contact.getLeadSource());
        //new Input(driver, "Birthdate").write(contact.getBirthDate());
        new TextArea(driver, "Description").write(contact.getDescription());
    }

    public boolean validateContact(Contact contact, String lastName) {
        return driver.findElement(By.xpath(String.format(LASTNAME, lastName))).getText().equals(contact.getLastName());
    }

    public void spinnerWait() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SPINNER));
        } catch (Exception e) {
            Assert.fail("Contact list is not loaded");
        }
    }

    public void networkThrotting() throws IOException {
        Map map = new HashMap();
        map.put("offline", false);
        map.put("latency", 5);
        map.put("download_throughput", 5000);
        map.put("upload_throughput", 5000);


        CommandExecutor executor = ((ChromeDriver)driver).getCommandExecutor();
        Response response = executor.execute(
                new Command(((ChromeDriver)driver).getSessionId(),    "setNetworkConditions", ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map)))
        );
    }
}

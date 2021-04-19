package pages;

import elements.DropDown;
import elements.Input;
import elements.LookUp;
import elements.TextArea;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactModal extends BasePage {

    public static final By SAVE_BUTTON = By.xpath("//*[contains(@class,'slds-float_right')]/..//..//span[text()='Save']");

    public NewContactModal(WebDriver driver) {
        super(driver);
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

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}

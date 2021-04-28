package steps;

import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.WebDriver;
import pages.ContactListPage;
import pages.NewContactModal;

public class ContactSteps {
    WebDriver driver;

    public ContactSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Creating contact '{contact.lastName}'")
    public void create(Contact contact) {
        ContactListPage contactListPage = new ContactListPage(driver);
        contactListPage.open();
        contactListPage.isContactPageOpened();
        contactListPage.clickNew();

        NewContactModal newContactModal = new NewContactModal(driver);
        newContactModal.createContact(contact);
        newContactModal.save();
        //contactListPage.isContactPageOpened();
        //contactListPage.open();
        //contactListPage.validateContact(contact, contact.getLastName());
    }
}

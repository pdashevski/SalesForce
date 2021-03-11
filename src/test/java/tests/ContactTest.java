package tests;

import io.qameta.allure.*;
import models.Contact;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ContactTest extends BaseTest {

    @Test(description = "Creation of contact")
    @Description("Some detailed test description")
    @Link("https://github.com/pdashevski")
    @Issue("COVID-19")
    @TmsLink("COVID-100009")
    public void createContact() throws IOException {
        loginPage.open();
        loginPage.login();
        contactsPage.openNewContacts();

        Contact contact = new Contact(
                "Petrikov",
                "Mr.",
                "Petrikov title is here",
                "+375171234567",
                "test@test.com",
                "ABBB",
                "K.Marksa 1",
                "Nezavisimosti 2",
                "Minsk",
                "220000",
                "Belarus",
                "0123456789",
                "+375291112233",
                "+37512345678",
                "Inna Ivanova",
                "QA and CO",
                "In-Store",
                "Petrikov's description",
                "+375291112233");

        contactsPage.createContact(contact);
        driver.findElement(By.xpath("//*[contains(@class,'slds-float_right')]/..//..//span[text()='Save']")).click();
        contactsPage.openContactPage();
        contactsPage.networkThrotting(); //network thrott for testing WAIT
        contactsPage.spinnerWait();

        Assert.assertTrue(contactsPage.validateContact(contact, contact.getLastName()));
    }
}
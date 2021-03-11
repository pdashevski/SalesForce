package tests;

import io.qameta.allure.*;
import models.Contact;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    String login = "paveldashevski-pzpr@force.com";
    String password = "552478Lil9";

    @Test(description = "Creation of contact")
    @Description("Some detailed test description")
    @Link("https://github.com/pdashevski")
    @Issue("COVID-19")
    @TmsLink("COVID-100009")
    public void createContact() {
        loginPage.open();
        loginPage.login(login, password);
        loginPage.loginClick();
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
        //contactsPage.isContactAddedWait(contact.getLastName());
        contactsPage.openContactPage();

        Assert.assertTrue(contactsPage.validateContact(contact, contact.getLastName()));
    }
}
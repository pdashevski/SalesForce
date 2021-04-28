package tests;

import io.qameta.allure.*;
import models.Contact;
import models.ContactFactory;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    String login = "paveldashevski-pzpr@force.com";
    String password = "552478Lil9";

    /*@Test(description = "Creation of contact")
    @Description("Some detailed test description")
    @Link("https://github.com/pdashevski")
    @Issue("COVID-19")
    @TmsLink("COVID-100009")
    public void createContact() throws IOException {
        loginPage.open();
        loginPage.login();
        contactListPage.clickNew();

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

        newContactModal.createContact(contact);
        //driver.findElement(By.xpath("//*[contains(@class,'slds-float_right')]/..//..//span[text()='Save']")).click();
        newContactModal.save();
        contactListPage.open();
        //contactListPage.networkThrotting(); //network thrott for testing WAIT
        contactListPage.spinnerWait();

        Assert.assertTrue(contactListPage.validateContact(contact, contact.getLastName()));
    }*/

    @Test(description = "Creation of contact")
    public void createContact() {
        loginSteps.login(login, password);
        Contact contact = new Contact("Petrikov",
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
        contactSteps.create(contact);
    }

    @Test
    public void bla() {
        System.out.println(ContactFactory.get());
    }

}
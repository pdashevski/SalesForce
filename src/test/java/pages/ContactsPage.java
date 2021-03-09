package pages;

import elements.DropDown;
import elements.LookUp;
import elements.TextArea;
import org.openqa.selenium.WebDriver;
import elements.Input;


public class ContactsPage extends BasePage {

    String url = "https://abcdef7.lightning.force.com/lightning/o/Contact/" +
            "new?count=2&nooverride=1&useRecordTypeCheck=1&navigationLocation=" +
            "MRU_LIST&backgroundContext=%2Flightning%2Fo%2FContact%2Flist%3FfilterName%3DRecent";

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public void openContacts() {
        driver.get(url);
    }

    public void createContact() {
        new Input(driver, "Last Name").write("Petrikov");
        new Input(driver, "First Name").write("Petr");
        new DropDown(driver, "Salutation").choseSalutation("Dr.");
        new Input(driver, "Title").write("My title");
        new Input(driver, "Phone").write("+375291112233");
        new Input(driver, "Mobile").write("+375291112233");
        new Input(driver, "Email").write("test@test.test");
        new LookUp(driver, "Account Name").select("ABBB");
        new TextArea(driver, "Mailing Street").write("MINSK 123");
        new TextArea(driver, "Other Street").write("MOSCOW 456");
        new Input(driver, "Mailing City").write("Minsk");
        new Input(driver, "Mailing Zip/Postal Code").write("220000");
        new Input(driver, "Mailing Country").write("Minsk");
        new Input(driver, "Fax").write("123456");
        new Input(driver, "Other Phone").write("+25555555");
        new Input(driver, "Asst. Phone").write("+01236546854");
        new Input(driver, "Assistant").write("Assist123");
        new Input(driver, "Department").write("QA");
        new DropDown(driver, "Lead Source").choseSalutation("In-Store");
        new Input(driver, "Birthdate").write("01.01.1990");
        new TextArea(driver, "Description").write("My description");
    }
}

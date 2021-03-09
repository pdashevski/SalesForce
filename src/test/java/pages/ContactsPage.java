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

    public void createContact(String lastName) {
        new Input(driver, "Last Name").write(lastName);
        new LookUp(driver, "Account Name").select("ABBB");
        new TextArea(driver, "Mailing Street").write("MINSK 123");
        new TextArea(driver, "Other Street").write("MOSCOW 456");
        new DropDown(driver).choseSalutation("Dr.");
        //new DropDown(driver, "Lead Source").choseSalutation("In-Store");
    }
}

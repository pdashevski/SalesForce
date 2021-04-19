package pages;

import com.google.common.collect.ImmutableMap;
import elements.DropDown;
import elements.LookUp;
import elements.TextArea;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class ContactsPage extends BasePage {



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








}

import org.openqa.selenium.WebDriver;

public class ContactsPage {

    WebDriver driver;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://abcdef7.lightning.force.com/lightning/o/Contact/" +
                "new?count=2&nooverride=1&useRecordTypeCheck=1&navigationLocation=" +
                "MRU_LIST&backgroundContext=%2Flightning%2Fo%2FContact%2Flist%3FfilterName%3DRecent");
    }

    public void create(String lastName) {
        new Input(driver, "Last Name").write(lastName);
        new Input(driver, "Account Name").write(lastName); //TODO
    }
}

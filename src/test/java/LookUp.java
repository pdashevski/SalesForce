import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LookUp {

    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";

    public LookUp(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String text) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
    }
    //*[@class='listContent']//ancestor::*[@title='ABBB']
}

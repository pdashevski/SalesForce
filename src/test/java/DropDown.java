import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    WebDriver driver;
    String label;
    String locator = "//span[contains(text(),'%s')]//following::*[@class='uiPopupTrigger']//a";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void choseSalutation(String option) {
        driver.findElement(By.xpath(locator)).click();
        Select selectSalutation = new Select(driver.findElement(By.xpath(String.format(locator, label))));
        selectSalutation.selectByVisibleText(option);
    }
}

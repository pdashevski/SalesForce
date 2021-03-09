package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    WebDriver driver;
    String locator = "//div[contains(@class,'isModal')]//span[contains(text(),'Salutation')]/../..//a";

    public DropDown(WebDriver driver) {
        this.driver = driver;
    }

    public void choseSalutation(String option) {
        driver.findElement(By.xpath(String.format(locator))).click();
        driver.findElement(By.cssSelector(String.format("a[title=%s]", option))).click();
    }
}

package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    WebDriver driver;
    String label;
    String locator = "//*[contains(text(), '%s')]/ancestor::div[contains(@class,'uiInputSelect ')]//a";
    String selectOption = "//*[contains(@class, 'select-options')]/descendant::a[contains(text(),'%s')]";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void choseSalutation(String option) {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(String.format(selectOption, option))).click();
    }
}

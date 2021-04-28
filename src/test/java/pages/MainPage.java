package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    public static final By HEADER_AD = By.xpath("//*[@class='trial-tours']"); //By.cssSelector(".oneTrialHeader");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSuccessfullLogin() {
        boolean isOpened;
        try {
            driver.findElement(HEADER_AD);
            isOpened = true;
        } catch (Exception ex) {
            isOpened = false;
        }
        return isOpened;
    }
}

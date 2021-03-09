import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactTest {

    String login = "paveldashevski-pzpr@force.com";
    String password = "552478Lil9";
    String URL = "https://abcdef7.my.salesforce.com";

    @Test
    public void createContact() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //LoginPage
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();

        ContactsPage contactsPage = new ContactsPage(driver);
        contactsPage.open();
        contactsPage.create("Lastname");

        driver.quit();
    }
}
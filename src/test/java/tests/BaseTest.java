package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.ContactListPage;
import pages.LoginPage;
import pages.NewContactModal;
import steps.AccountSteps;
import steps.ContactSteps;
import steps.LoginSteps;
import tests.base.TestListener;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    NewContactModal newContactModal;
    ContactListPage contactListPage;
    LoginSteps loginSteps;
    ContactSteps contactSteps;
    AccountSteps accountSteps;

    @BeforeMethod(description = "Browser opening")
    public void setup(ITestContext context) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);

        newContactModal = new NewContactModal(driver);
        contactListPage = new ContactListPage(driver);
        loginSteps = new LoginSteps(driver);
        contactSteps = new ContactSteps(driver);
        accountSteps = new AccountSteps(driver);

        context.setAttribute("driver", driver);
    }

    @AfterMethod(alwaysRun = true, description = "Browser closing")
    public void closeBrowser() {
        driver.quit();
    }
}

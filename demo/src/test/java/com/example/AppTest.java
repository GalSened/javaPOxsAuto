
import static org.junit.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.chromium.ChromiumDriverCommandExecutor;
import org.openqa.selenium.html5.LocationContext;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.out.println("-----This is the beginning of our test !!!-----");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Gal\\Desktop\\Oxs_Testing\\New_AutomtionOXS\\New_AutomationOXS\\chromedriver.exe");

        driver = new ChromeDriver();

    }

    @Test
    public void Login() {

        driver.get("https://stg.oxs.co.il");
        driver.manage().window().maximize();
    }
}

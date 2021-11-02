
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;

import com.google.common.annotations.VisibleForTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.*;

public class App {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Gal//Desktop//Oxs_Testing//New_AutomtionOXS//New_AutomationOXS//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");

		driver.navigate().to("https://www.stg.oxs.co.il");

	}
}
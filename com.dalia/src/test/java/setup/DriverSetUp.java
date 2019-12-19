package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ProjectConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {

	/* Initialize WebDriver */

	public static WebDriver browser;

	@BeforeMethod(description = "Test SetUp Started")
	public static void openBrowser() {

		/*
		 * WebDriverManager.firefoxdriver().setup();
		 * 
		 * browser = new FirefoxDriver();
		 * 
		 * setup ChormeDriver using WebDriverManager
		 * 
		 */

		WebDriverManager.chromedriver().setup();

		/* Create an object WebDriver for CHROME */

		browser = new ChromeDriver();

		browser.get(ProjectConfig.prop.getProperty("baseurl"));
		
		WebElement yunoLogo = browser.findElement(By.xpath("//div[@class=\"navbar-logo yuno-logo ng-scope\"]"));
		
		if (yunoLogo.isDisplayed() == false)

		{

			throw new RuntimeException("Yuno Logo not displayed");

		}

		browser.manage().window().maximize();

	}

	@AfterMethod(description = "Test setup Completed")
	public static void closeBrowser() {
		browser.quit();
	}

}

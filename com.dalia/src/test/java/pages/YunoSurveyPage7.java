package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.ProjectConfig;
import utils.WaitForPagesToLoad;

public class YunoSurveyPage7 extends WaitForPagesToLoad {

	public static WebElement element = null;

	/* Returns the input field element on page 7 of survey */
	
	private final WebElement notARobotField() {

		element = browser.findElement(By.xpath("//input[@name='input']"));

		return element;

	}

	public void enterInNotARobotField() {

		waitForElementToBeClickable(browser, notARobotField()).sendKeys(ProjectConfig.prop.getProperty("feedforrobot"));

	}

}

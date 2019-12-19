package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.ProjectConfig;
import utils.WaitForPagesToLoad;

public class YunoSurveyPage5 extends WaitForPagesToLoad {

	public static WebElement element = null;

	/* Returns the input field element on page 5 of survey */

	private final WebElement secretsQuestions() {

		element = browser.findElement(By.xpath("//input[@name='input']"));

		return element;

	}

	public void enterSecretsQuestions() {

		waitForElementToBeClickable(browser, secretsQuestions()).sendKeys(ProjectConfig.prop.getProperty("page5reply"));

	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.WaitForPagesToLoad;

public class YunoSurveyPage6 extends WaitForPagesToLoad {

	public static WebElement element = null;

	/* Returns the radio button element on page 6  of survey with text Somewhat agree */

	private final WebElement infoMedia() {

		element = browser.findElement(By.xpath("//label[contains(text(),'Somewhat agree')]"));

		return element;

	}

	public void selectInfoMedia() {

		waitForElementToBeClickable(browser, infoMedia()).click();

	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.WaitForPagesToLoad;

public class YunoSurveyPage8 extends WaitForPagesToLoad {

	public static WebElement element = null;

	/* Returns the input element as radio button to select page 8 of survey */

	private final WebElement areaToLive() {

		element = browser.findElement(By.xpath("//label[contains(text(),'City')]"));

		return element;

	}

	public void seelectAreaToLive() {

		waitForElementToBeClickable(browser, areaToLive()).click();

	}

}

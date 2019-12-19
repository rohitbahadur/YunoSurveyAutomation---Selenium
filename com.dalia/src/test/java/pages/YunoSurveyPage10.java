package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.ScrollPage;
import utils.WaitForPagesToLoad;

public class YunoSurveyPage10 extends WaitForPagesToLoad {

	public static WebElement element = null;
	ScrollPage scroll = new ScrollPage();

	/* Returns the input type element as radio button on page 10 of survey */

	private WebElement likeMostAbout() {

		element = browser.findElement(By.xpath("//label[contains(text(),'Cinematography')]"));

		return element;

	}

	public void selectLikeMostAbout() {
		scroll.scrollPage();
		waitForElementToBeClickable(browser, likeMostAbout()).click();

	}

}

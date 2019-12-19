package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.WaitForPagesToLoad;

public class YunoSurveyPage9 extends WaitForPagesToLoad {

	public static WebElement element = null;

	/* Returns the input element as radio button page 9 of survey */
	
	private final WebElement favAwardWiningFilms() {

		element = browser.findElement(By.xpath("//label[contains(text(),'Forrest Gump')]"));

		return element;

	}

	public void selectFavAwardWiningFilms() {
		waitForElementToBeClickable(browser, favAwardWiningFilms()).click();

	}

}

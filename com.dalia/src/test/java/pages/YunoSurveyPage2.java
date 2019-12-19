package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.WaitForPagesToLoad;
import utils.WaitingForSync;

public class YunoSurveyPage2 extends WaitForPagesToLoad {

	WaitingForSync wm = new WaitingForSync();
	public static WebElement element = null;

	/* Returns the radio button with I don't regualarly read the news */

	private final WebElement textIDoNot() {
		element = browser.findElement(By.xpath("//label[contains(text(),\"I don't regularly read the news\")]"));

		return element;
	}

	public void clickOntextIDoNot() {

		waitForElementToBeClickable(browser, textIDoNot()).click();
		;
		wm.wait(1000);
	}
}
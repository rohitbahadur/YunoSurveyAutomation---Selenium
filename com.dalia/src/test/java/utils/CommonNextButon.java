package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonNextButon extends WaitForPagesToLoad{
	WaitingForSync wm = new WaitingForSync();
	public static WebElement element = null;
	
	private final WebElement buttonWithTextNext() {
		element = browser.findElement(By.xpath("//button[@class='btn next_button_button custom_button ng-binding']"));
		return element;
	}

	/* Action performed on next button onn every page */

	public void clickOnButtonWithTextNext() {

		waitForElementToBeClickable(browser, buttonWithTextNext()).click();
		wm.wait(1000);
	}
	
}

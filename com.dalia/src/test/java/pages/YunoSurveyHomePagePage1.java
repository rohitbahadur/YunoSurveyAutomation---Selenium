
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.WaitForPagesToLoad;

public class YunoSurveyHomePagePage1 extends WaitForPagesToLoad {

	public static WebElement element = null;

	/* Returns the check box element on welcome page of survey */

	private final WebElement homepageAgreementCheckbox() {
		element = browser.findElement(By.xpath("//label[@class='ng-binding ng-scope']"));
		return element;
	}

	/* Action performed on email field element on Welcome page */

	public void clickhomepageAgreementCheckbox() {

		waitForElementToBeClickable(browser, homepageAgreementCheckbox()).click();

	}


}

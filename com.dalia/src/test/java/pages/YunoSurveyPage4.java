package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.ScrollPage;
import utils.WaitForPagesToLoad;

public class YunoSurveyPage4 extends WaitForPagesToLoad{

	ScrollPage scroll = new ScrollPage(); 
	public static WebElement element = null;

	/* Returns the check box element on page 4 of survey with text Other */
	
	private final WebElement selectCheckBoxesPage4() {
		element = browser.findElement(By.xpath("//label[contains(text(),'Other')]"));
			return element;

	}

	public void clickCheckBoxesPage4() {
	
		scroll.scrollPage();
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) browser;
		 * js.executeScript("window.scrollBy(0,900)");
		 */
		  waitForElementToBeClickable(browser, selectCheckBoxesPage4()).click();
	

	}

	
}

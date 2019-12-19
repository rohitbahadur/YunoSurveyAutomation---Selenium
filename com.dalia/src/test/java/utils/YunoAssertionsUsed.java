package utils;

import org.openqa.selenium.By;
import org.testng.Assert;

import setup.DriverSetUp;


public class YunoAssertionsUsed extends DriverSetUp {

	WaitingForSync wm = new WaitingForSync();

	public void yunoAssertFunction() {
		wm.wait(2000);

		/******* Assertion on the last page to ensure the survey was completed *******/

		String expectedTextOnThanksPage = browser.findElement(By.xpath("//a[@class='support-link']")).getText();

		String actualTextOnThanksPage = "contact@yunosurveys.com";

		Assert.assertEquals(actualTextOnThanksPage, expectedTextOnThanksPage);

		System.out.println("Test Pass");
	}

}

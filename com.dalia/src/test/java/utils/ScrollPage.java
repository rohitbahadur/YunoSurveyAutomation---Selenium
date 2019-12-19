package utils;

import org.openqa.selenium.JavascriptExecutor;

import setup.DriverSetUp;

public class ScrollPage extends DriverSetUp{

	public void scrollPage() {
		
		JavascriptExecutor js = (JavascriptExecutor) browser;
		js.executeScript("window.scrollBy(0,300)");

	}
}

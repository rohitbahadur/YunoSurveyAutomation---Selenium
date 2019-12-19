
package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.ScrollPage;
import utils.WaitForPagesToLoad;
import utils.WaitingForSync;

public class YunoSurveyPage3 extends WaitForPagesToLoad {

	public static WebElement element = null;

	WaitingForSync wm = new WaitingForSync();

	ScrollPage scroll = new ScrollPage();

	/* Returns the check box list page 3 of survey */

	public void selectCheckBoxesPage3() {
		
		boolean isSelected = false;
        wm.wait(1000);
		List<WebElement> checkbox = browser
				.findElements(By.xpath("//div[@class='question_option question_option_background_hover ng-scope']"));

		scroll.scrollPage();
		/* Check the number of check boxes present on this page */
		int size = checkbox.size();

		/* iterate over the check boxes and select if not selected */

		for (int i = 0; i < size - 1; i++) {
			isSelected = checkbox.get(i).isSelected();

			if (!isSelected) {

				checkbox.get(i).click();

			}

		}

		/*
		 * just a print message to ascertain all the check boxes are selected but the
		 * last one(Note: i< size -1)
		 */

		System.out.println("All required options selected");

	}

}

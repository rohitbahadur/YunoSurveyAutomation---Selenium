package test;

import org.testng.annotations.Test;

import pages.YunoSurveyHomePagePage1;
import pages.YunoSurveyPage10;
import pages.YunoSurveyPage2;
import pages.YunoSurveyPage3;
import pages.YunoSurveyPage4;
import pages.YunoSurveyPage5;
import pages.YunoSurveyPage6;
import pages.YunoSurveyPage7;
import pages.YunoSurveyPage8;
import pages.YunoSurveyPage9;
import setup.DriverSetUp;
import utils.CommonNextButon;
import utils.YunoAssertionsUsed;


public class YunoSurveySampleTest extends DriverSetUp {

	YunoSurveyHomePagePage1 welcomePage = new YunoSurveyHomePagePage1();

	YunoSurveyPage2 page2 = new YunoSurveyPage2();

	YunoSurveyPage3 page3 = new YunoSurveyPage3();

	YunoSurveyPage4 page4 = new YunoSurveyPage4();

	YunoSurveyPage5 page5 = new YunoSurveyPage5();

	YunoSurveyPage6 page6 = new YunoSurveyPage6();

	YunoSurveyPage7 page7 = new YunoSurveyPage7();

	YunoSurveyPage8 page8 = new YunoSurveyPage8();

	YunoSurveyPage9 page9 = new YunoSurveyPage9();

	YunoSurveyPage10 page10 = new YunoSurveyPage10();

	CommonNextButon clickNextButton = new CommonNextButon();
 
	YunoAssertionsUsed yunoAssertionsUsed = new YunoAssertionsUsed();


	
	@Test(description = "Yuno Survery")
	
	public void yunoSurvery() {

		welcomePage.clickhomepageAgreementCheckbox();
		clickNextButton.clickOnButtonWithTextNext();

		page2.clickOntextIDoNot();
		clickNextButton.clickOnButtonWithTextNext();

		page3.selectCheckBoxesPage3();
		clickNextButton.clickOnButtonWithTextNext();

		page4.clickCheckBoxesPage4();
		clickNextButton.clickOnButtonWithTextNext();

		page5.enterSecretsQuestions();
		clickNextButton.clickOnButtonWithTextNext();

		page6.selectInfoMedia();
		clickNextButton.clickOnButtonWithTextNext();

		page7.enterInNotARobotField();
		clickNextButton.clickOnButtonWithTextNext();

		page8.seelectAreaToLive();
		clickNextButton.clickOnButtonWithTextNext();

		page9.selectFavAwardWiningFilms();
		clickNextButton.clickOnButtonWithTextNext();

		page10.selectLikeMostAbout();
		clickNextButton.clickOnButtonWithTextNext();


		
		/******* Assertion on the last page to ensure the survey was completed *******/
		
		yunoAssertionsUsed.yunoAssertFunction();
	}

}
package org.priyanshus.sdk.bdd.stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.priyanshus.sdk.wd.factory.WebDriverFactory;
import org.priyanshus.sdk.wd.pages.CucumberSchoolPage;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSchoolStepDefinitions {

	WebDriver driver;
	WebDriverFactory wdFactory;
	CucumberSchoolPage schoolPage;

	public CucumberSchoolStepDefinitions(WebDriverFactory wdFactory) {
		this.wdFactory = wdFactory;
		this.driver = wdFactory.getDriver();
		this.schoolPage = PageFactory.initElements(driver, CucumberSchoolPage.class);
	}

	@When("^I play first free lesson$")
	public void playFirstLesson() {
		schoolPage.playFirstLesson();
	}

	@Then("^I should see button to watch first lesson free$")
	public void assertWatchFirstLessonButtonVisibility() {
		boolean condition = schoolPage.isSchoolWatchButtonVisible();
		assertTrue("Watch first lessor for free button is visible", condition);
	}

	@Then("^video modal should be visible$")
	public void assertVideoModalVisibility() {
		boolean condition = schoolPage.isVideoPlaying();
		assertTrue("Video modal is visible", condition);
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
}

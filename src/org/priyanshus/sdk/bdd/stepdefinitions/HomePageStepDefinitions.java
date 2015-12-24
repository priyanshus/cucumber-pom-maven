package org.priyanshus.sdk.bdd.stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.priyanshus.sdk.wd.factory.WebDriverFactory;
import org.priyanshus.sdk.wd.pages.HomePage;
import org.priyanshus.sdk.wd.pages.MainNavigationBarPage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {

	WebDriver driver;
	WebDriverFactory wdFactory;
	HomePage homePage;
	MainNavigationBarPage mainNavigationBar;

	public HomePageStepDefinitions(WebDriverFactory wdFactory) {
		this.wdFactory = wdFactory;
		this.driver = wdFactory.getDriver();
		this.homePage = PageFactory.initElements(driver, HomePage.class);
		this.mainNavigationBar = PageFactory.initElements(driver, MainNavigationBarPage.class);
	}

	@Given("^I am on the cucumber home page$")
	public void openCucumberApp() {
		System.out.println(driver);
		driver.get("https://cucumber.io/");
	}
	
	@Given("^I am on the cucumber school page$")
	public void openCucumberSchool() {
		openCucumberApp();
		visitCucumberSchool();
	}

	@Then("^title should be \"([^\"]*)\"$")
	public void assertTitle(String expectedTitle) {
		boolean condition = homePage.getTitle().equals(expectedTitle);
		assertTrue("Title displayed as expected", condition);
	}

	@When("^I visit the cucumber school$")
	public void visitCucumberSchool() {
		mainNavigationBar.navigateToCucumberSchool();
	}

	@After
	public void closeBrowser() {
		driver.close();
	}
}

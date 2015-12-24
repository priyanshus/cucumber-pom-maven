package org.priyanshus.sdk.wd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainNavigationBarPage {
	@FindBy(css = "a[href='/school']")
	@CacheLookup
	WebElement schoolNavigationLink;

	private WebDriver driver;

	public MainNavigationBarPage(WebDriver driver) {
		this.driver = driver;
	}

	public CucumberSchoolPage navigateToCucumberSchool() {
		schoolNavigationLink.click();

		return PageFactory.initElements(driver, CucumberSchoolPage.class);
	}

}

package org.priyanshus.sdk.wd.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		String titleText = driver.getTitle();
		return titleText;
	}
}

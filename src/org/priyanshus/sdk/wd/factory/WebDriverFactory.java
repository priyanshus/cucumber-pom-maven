package org.priyanshus.sdk.wd.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

	private WebDriver driver;
	private boolean intialized = false;

	public WebDriverFactory() {
		// initialize the driver
		if (!intialized) {
			driver = new FirefoxDriver();
			intialized = true;
		}
	}

	public WebDriver getDriver() {
		return driver;
	}
}

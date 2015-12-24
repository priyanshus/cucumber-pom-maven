package org.priyanshus.sdk.wd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CucumberSchoolPage {
	@FindBy(css = ".btn-school-watch")
	@CacheLookup
	WebElement schoolWatchBtn;

	@FindBy(css = ".fancybox-opened")
	WebElement videoModal;

	public boolean isSchoolWatchButtonVisible() {
		return schoolWatchBtn.isDisplayed();
	}

	public void playFirstLesson() {
		schoolWatchBtn.click();
	}

	public boolean isVideoPlaying() {
		return videoModal.isDisplayed();
	}
}
